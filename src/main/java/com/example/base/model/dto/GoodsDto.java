package com.example.base.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
public class GoodsDto {

    private Long id;

    private Long parentId;

    private String projectId;

    private String companyCode;

    private String parentVoucherNumber;

    private String voucherNumber;

    private String orderNumber;

    private String invoiceNumber;

    private String customerNumber;

    private String customerTaxNumber;

    private String customerName;

    private String customerBankAccount;

    private String customerAddressPhone;

    private String customerPhone;

    private String area;

    private String invoiceTypeCode;

    private String goodsCode;

    private String goodsName;

    private String goodsSpecification;

    private String goodsUnit;

    private BigDecimal price;

    private BigDecimal unitPrice;

    private BigDecimal quantity;

    private BigDecimal amount;

    private BigDecimal originalAmount;

    private BigDecimal taxRate;

    private BigDecimal tax;

    private BigDecimal originalTax;

    private BigDecimal amountTax;

    private BigDecimal originalAmountTax;

    private BigDecimal discountAmountTax;

    private BigDecimal discountAmount;

    private String remarks;

    private String consignee;

    private String cellPhoneNumber;

    private String location;

    private String cityCode;

    private String detailedAddress;

    private String postCode;

    private Date createDate;

    private Integer status;

    private Integer source;

    private Integer serialStatus;

    private Short commodityFlag;

    private Date gmtCreate;

    private Date gmtModified;


    public GoodsDto() {
    }

}