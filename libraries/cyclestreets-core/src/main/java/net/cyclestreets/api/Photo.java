package net.cyclestreets.api;

import org.osmdroid.util.GeoPoint;

public class Photo 
{
  private final int id_;
  private final String featureName_;
  private final String caption_;
  private final String url_;
  private final String thumbnailUrl_;
  private GeoPoint position_;
  
  Photo(int id, 
        String feature,
        String caption,
        String url,
        String thumbnailUrl,
        GeoPoint position)
  {
    id_ = id;
    featureName_ = feature;
    caption_ = caption;
    url_ = url;
    thumbnailUrl_ = thumbnailUrl;
    position_ = position;
  } // Photo
  
  public int id() { return id_; }
  public String feature() { return featureName_; }
  public String caption() { return caption_; }
  public String url() { return url_; }
  public String thumbnailUrl() { return thumbnailUrl_; }
  public GeoPoint position() { return position_; }

  void setPosition(final GeoPoint position) { position_ = position; }

  @Override
  public int hashCode() { return id_; }

  /*
   * Photos are equal if they have the same id
   */
  @Override
  public boolean equals(Object obj) 
  {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Photo other = (Photo)obj;
    if (id_ != other.id_)
      return false;
    return true;
  } // equals

  @Override
  public String toString() { return id_ + ":" + caption_; }
} // class Photo
