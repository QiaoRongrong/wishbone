package org.jory.wishbone.common.object;

/**
 * TODO： 1. About the dam builder. 2. final filed lefecycle parameter in method.
 * 
 * @author qiaorongrong jory1002@gmail.com
 *
 */

public class Image {

    private Long vendorItemImageId;
    private Long vendorItemId;
    private String path;
    private Byte imageOrder = Byte.valueOf("0");

    public static class Builder {
	private Long vendorItemImageId;
	private Long vendorItemId;
	private String path;
	private Byte imageOrder = Byte.valueOf("0");
	
	public Builder(){}
	
	public Builder imageId(Long imageId) {
	    this.vendorItemImageId = imageId;
	    return this;
	}
	
	public Builder vendorItemId(Long vendorItemId) {
	    this.vendorItemId = vendorItemId;
	    return this;
	}
	public Builder path(String path) {
	    this.path = path;
	    return this;
	}
	public Builder imageOrder(Byte imageOrder) {
	    this.imageOrder = imageOrder;
	    return this;
	}
	
	public Image build(){
	    return new Image(this);
	}
    }
    
    private Image(Builder builder) {
	this.vendorItemImageId = builder.vendorItemImageId;
	this.vendorItemId = builder.vendorItemId;
	this.path = builder.path;
	this.imageOrder = builder.imageOrder;
    }
    
    public Long getVendorItemImageId() {
	return vendorItemImageId;
    }

    public void setVendorItemImageId(Long vendorItemImageId) {
	this.vendorItemImageId = vendorItemImageId;
    }

    public Long getVendorItemId() {
	return vendorItemId;
    }

    public void setVendorItemId(Long vendorItemId) {
	this.vendorItemId = vendorItemId;
    }

    public String getPath() {
	return path;
    }

    public void setPath(String path) {
	this.path = path;
    }

    public Byte getImageOrder() {
	return imageOrder;
    }

    public void setImageOrder(Byte imageOrder) {
	this.imageOrder = imageOrder;
    }

    public static void main(String[] args) {
	// TODO Auto-generated method stub

    }

}

/**
 * package com.coupang.product.domain.business.vendoritem;
 * 
 * import
 * com.coupang.product.domain.business.vendoritemimage.VendorItemImageType;
 * import lombok.Getter; import lombok.Setter;
 * 
 * @Getter
 * @Setter
 * @SuppressWarnings("PMD.UnusedPrivateField") public class ItemImageInfo {
 * 
 *                                             private Long vendorItemImageId;
 *                                             private Long vendorItemId;
 *                                             private String path; private
 *                                             VendorItemImageType imageType;
 *                                             private Byte imageOrder =
 *                                             Byte.valueOf("0");
 * 
 *                                             public static class
 *                                             ItemImageInfoBuilder { private
 *                                             static ItemImageInfo imageInfo =
 *                                             new ItemImageInfo(); private
 *                                             static ItemImageInfoBuilder
 *                                             builder = new
 *                                             ItemImageInfoBuilder();
 * 
 *                                             public static
 *                                             ItemImageInfoBuilder getBuilder()
 *                                             { return builder; }
 * 
 *                                             public static ItemImageInfo
 *                                             build() { return imageInfo; }
 * 
 *                                             public static
 *                                             ItemImageInfoBuilder
 *                                             withImageId(Long imageId) {
 *                                             imageInfo.vendorItemImageId =
 *                                             imageId; return builder; }
 * 
 *                                             public static
 *                                             ItemImageInfoBuilder
 *                                             withVendorItemId(Long
 *                                             vendorItemId) {
 *                                             imageInfo.vendorItemId =
 *                                             vendorItemId; return builder; }
 * 
 *                                             public static
 *                                             ItemImageInfoBuilder
 *                                             withPath(String path) {
 *                                             imageInfo.path = path; return
 *                                             builder; }
 * 
 *                                             public static
 *                                             ItemImageInfoBuilder
 *                                             withImageType(VendorItemImageType
 *                                             imageType) { imageInfo.imageType
 *                                             = imageType; return builder; }
 * 
 *                                             public static
 *                                             ItemImageInfoBuilder
 *                                             withImageOrder(Byte imageOrder) {
 *                                             imageInfo.imageOrder =
 *                                             imageOrder; return builder; }
 * 
 *                                             } }
 */
