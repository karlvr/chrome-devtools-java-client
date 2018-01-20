package com.github.kklisura.cdtp.protocol.types.css;

import com.github.kklisura.cdtp.protocol.annotations.Optional;
import java.util.List;
import com.github.kklisura.cdtp.protocol.annotations.Experimental;

/**
 * CSS media rule descriptor.
 */
public class CSSMedia {

	private String text;

	private Source source;

	@Optional
	private String sourceURL;

	@Optional
	private SourceRange range;

	@Optional
	private String styleSheetId;

	@Experimental
	@Optional
	private List<MediaQuery> mediaList;

	/**
	 * Media query text.
	 */
	public String getText() {
		return text;
	}

	/**
	 * Media query text.
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * Source of the media query: "mediaRule" if specified by a @media rule, "importRule" if specified by an @import rule, "linkedSheet" if specified by a "media" attribute in a linked stylesheet's LINK tag, "inlineSheet" if specified by a "media" attribute in an inline stylesheet's STYLE tag.
	 */
	public Source getSource() {
		return source;
	}

	/**
	 * Source of the media query: "mediaRule" if specified by a @media rule, "importRule" if specified by an @import rule, "linkedSheet" if specified by a "media" attribute in a linked stylesheet's LINK tag, "inlineSheet" if specified by a "media" attribute in an inline stylesheet's STYLE tag.
	 */
	public void setSource(Source source) {
		this.source = source;
	}

	/**
	 * URL of the document containing the media query description.
	 */
	public String getSourceURL() {
		return sourceURL;
	}

	/**
	 * URL of the document containing the media query description.
	 */
	public void setSourceURL(String sourceURL) {
		this.sourceURL = sourceURL;
	}

	/**
	 * The associated rule (@media or @import) header range in the enclosing stylesheet (if available).
	 */
	public SourceRange getRange() {
		return range;
	}

	/**
	 * The associated rule (@media or @import) header range in the enclosing stylesheet (if available).
	 */
	public void setRange(SourceRange range) {
		this.range = range;
	}

	/**
	 * Identifier of the stylesheet containing this object (if exists).
	 */
	public String getStyleSheetId() {
		return styleSheetId;
	}

	/**
	 * Identifier of the stylesheet containing this object (if exists).
	 */
	public void setStyleSheetId(String styleSheetId) {
		this.styleSheetId = styleSheetId;
	}

	/**
	 * Array of media queries.
	 */
	public List<MediaQuery> getMediaList() {
		return mediaList;
	}

	/**
	 * Array of media queries.
	 */
	public void setMediaList(List<MediaQuery> mediaList) {
		this.mediaList = mediaList;
	}
}