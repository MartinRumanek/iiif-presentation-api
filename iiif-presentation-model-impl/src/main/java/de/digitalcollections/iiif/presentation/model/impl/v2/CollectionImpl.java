package de.digitalcollections.iiif.presentation.model.impl.v2;

import de.digitalcollections.iiif.presentation.model.api.v2.Collection;
import de.digitalcollections.iiif.presentation.model.api.v2.Metadata;
import de.digitalcollections.iiif.presentation.model.api.v2.PropertyValue;
import de.digitalcollections.iiif.presentation.model.api.v2.Thumbnail;
import de.digitalcollections.iiif.presentation.model.api.v2.references.CollectionReference;
import de.digitalcollections.iiif.presentation.model.api.v2.references.ManifestReference;
import java.net.URI;
import java.time.Instant;
import java.util.List;

public class CollectionImpl extends AbstractIiifResourceImpl implements Collection {

  private final String context = "http://iiif.io/api/presentation/2/context.json";
  private PropertyValue description; // recommended
  private PropertyValue label; // required
  private List<Metadata> metadata; // recommended
  private List<CollectionReference> subCollections;
  private List<ManifestReference> manifests;
  private Thumbnail thumbnail; // recommended
  private String viewingHint; // optional
  private Instant navDate; // optional

  public CollectionImpl() {
  }

  public CollectionImpl(URI id, PropertyValue label, List<Metadata> metadata) {
    assert id != null;
    assert label != null;

    this.id = id;
    this.label = label;

    this.metadata = metadata;

    type = "sc:Collection";
  }

  @Override
  public String getContext() {
    return context;
  }

  @Override
  public PropertyValue getDescription() {
    return description;
  }

  @Override
  public void setDescription(PropertyValue description) {
    this.description = description;
  }

  @Override
  public PropertyValue getLabel() {
    return label;
  }

  @Override
  public List<Metadata> getMetadata() {
    return metadata;
  }

  @Override
  public Thumbnail getThumbnail() {
    return thumbnail;
  }

  @Override
  public void setThumbnail(Thumbnail thumbnail) {
    this.thumbnail = thumbnail;
  }

  @Override
  public String getViewingHint() {
    return viewingHint;
  }

  @Override
  public void setViewingHint(String viewingHint) {
    this.viewingHint = viewingHint;
  }

  @Override
  public List<ManifestReference> getManifests() {
    return this.manifests;
  }

  @Override
  public void setManifests(List<ManifestReference> manifests) {
    this.manifests = manifests;
  }

  @Override
  public List<CollectionReference> getSubCollections() {
    return subCollections;
  }

  @Override
  public void setSubCollections(List<CollectionReference> collections) {
    this.subCollections = collections;
  }

  @Override
  public Instant getNavDate() {
    return navDate;
  }

  @Override
  public void setNavDate(Instant navDate) {
    this.navDate = navDate;
  }
}
