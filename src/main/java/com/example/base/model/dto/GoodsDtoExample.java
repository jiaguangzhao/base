package com.example.base.model.dto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsDtoExample {

    private String orderByClause;

    private boolean distinct;

    private List<Criteria> oredCriteria;

    public GoodsDtoExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        private List<Criterion> criteria;

        protected GeneratedCriteria() {
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null.");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(String value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(String value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(String value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(String value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(String value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(String value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLike(String value) {
            addCriterion("project_id like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotLike(String value) {
            addCriterion("project_id not like", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<String> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<String> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(String value1, String value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(String value1, String value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNull() {
            addCriterion("company_code is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIsNotNull() {
            addCriterion("company_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeEqualTo(String value) {
            addCriterion("company_code =", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotEqualTo(String value) {
            addCriterion("company_code <>", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThan(String value) {
            addCriterion("company_code >", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("company_code >=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThan(String value) {
            addCriterion("company_code <", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLessThanOrEqualTo(String value) {
            addCriterion("company_code <=", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeLike(String value) {
            addCriterion("company_code like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotLike(String value) {
            addCriterion("company_code not like", value, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeIn(List<String> values) {
            addCriterion("company_code in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotIn(List<String> values) {
            addCriterion("company_code not in", values, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeBetween(String value1, String value2) {
            addCriterion("company_code between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCodeNotBetween(String value1, String value2) {
            addCriterion("company_code not between", value1, value2, "companyCode");
            return (Criteria) this;
        }

        public Criteria andParentVoucherNumberIsNull() {
            addCriterion("parent_voucher_number is null");
            return (Criteria) this;
        }

        public Criteria andParentVoucherNumberIsNotNull() {
            addCriterion("parent_voucher_number is not null");
            return (Criteria) this;
        }

        public Criteria andParentVoucherNumberEqualTo(String value) {
            addCriterion("parent_voucher_number =", value, "parentVoucherNumber");
            return (Criteria) this;
        }

        public Criteria andParentVoucherNumberNotEqualTo(String value) {
            addCriterion("parent_voucher_number <>", value, "parentVoucherNumber");
            return (Criteria) this;
        }

        public Criteria andParentVoucherNumberGreaterThan(String value) {
            addCriterion("parent_voucher_number >", value, "parentVoucherNumber");
            return (Criteria) this;
        }

        public Criteria andParentVoucherNumberGreaterThanOrEqualTo(String value) {
            addCriterion("parent_voucher_number >=", value, "parentVoucherNumber");
            return (Criteria) this;
        }

        public Criteria andParentVoucherNumberLessThan(String value) {
            addCriterion("parent_voucher_number <", value, "parentVoucherNumber");
            return (Criteria) this;
        }

        public Criteria andParentVoucherNumberLessThanOrEqualTo(String value) {
            addCriterion("parent_voucher_number <=", value, "parentVoucherNumber");
            return (Criteria) this;
        }

        public Criteria andParentVoucherNumberLike(String value) {
            addCriterion("parent_voucher_number like", value, "parentVoucherNumber");
            return (Criteria) this;
        }

        public Criteria andParentVoucherNumberNotLike(String value) {
            addCriterion("parent_voucher_number not like", value, "parentVoucherNumber");
            return (Criteria) this;
        }

        public Criteria andParentVoucherNumberIn(List<String> values) {
            addCriterion("parent_voucher_number in", values, "parentVoucherNumber");
            return (Criteria) this;
        }

        public Criteria andParentVoucherNumberNotIn(List<String> values) {
            addCriterion("parent_voucher_number not in", values, "parentVoucherNumber");
            return (Criteria) this;
        }

        public Criteria andParentVoucherNumberBetween(String value1, String value2) {
            addCriterion("parent_voucher_number between", value1, value2, "parentVoucherNumber");
            return (Criteria) this;
        }

        public Criteria andParentVoucherNumberNotBetween(String value1, String value2) {
            addCriterion("parent_voucher_number not between", value1, value2, "parentVoucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberIsNull() {
            addCriterion("voucher_number is null");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberIsNotNull() {
            addCriterion("voucher_number is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberEqualTo(String value) {
            addCriterion("voucher_number =", value, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberNotEqualTo(String value) {
            addCriterion("voucher_number <>", value, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberGreaterThan(String value) {
            addCriterion("voucher_number >", value, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_number >=", value, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberLessThan(String value) {
            addCriterion("voucher_number <", value, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberLessThanOrEqualTo(String value) {
            addCriterion("voucher_number <=", value, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberLike(String value) {
            addCriterion("voucher_number like", value, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberNotLike(String value) {
            addCriterion("voucher_number not like", value, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberIn(List<String> values) {
            addCriterion("voucher_number in", values, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberNotIn(List<String> values) {
            addCriterion("voucher_number not in", values, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberBetween(String value1, String value2) {
            addCriterion("voucher_number between", value1, value2, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andVoucherNumberNotBetween(String value1, String value2) {
            addCriterion("voucher_number not between", value1, value2, "voucherNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNull() {
            addCriterion("order_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIsNotNull() {
            addCriterion("order_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumberEqualTo(String value) {
            addCriterion("order_number =", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotEqualTo(String value) {
            addCriterion("order_number <>", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThan(String value) {
            addCriterion("order_number >", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
            addCriterion("order_number >=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThan(String value) {
            addCriterion("order_number <", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLessThanOrEqualTo(String value) {
            addCriterion("order_number <=", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberLike(String value) {
            addCriterion("order_number like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotLike(String value) {
            addCriterion("order_number not like", value, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberIn(List<String> values) {
            addCriterion("order_number in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotIn(List<String> values) {
            addCriterion("order_number not in", values, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberBetween(String value1, String value2) {
            addCriterion("order_number between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andOrderNumberNotBetween(String value1, String value2) {
            addCriterion("order_number not between", value1, value2, "orderNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNull() {
            addCriterion("invoice_number is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIsNotNull() {
            addCriterion("invoice_number is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberEqualTo(String value) {
            addCriterion("invoice_number =", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotEqualTo(String value) {
            addCriterion("invoice_number <>", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThan(String value) {
            addCriterion("invoice_number >", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_number >=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThan(String value) {
            addCriterion("invoice_number <", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLessThanOrEqualTo(String value) {
            addCriterion("invoice_number <=", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberLike(String value) {
            addCriterion("invoice_number like", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotLike(String value) {
            addCriterion("invoice_number not like", value, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberIn(List<String> values) {
            addCriterion("invoice_number in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotIn(List<String> values) {
            addCriterion("invoice_number not in", values, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberBetween(String value1, String value2) {
            addCriterion("invoice_number between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andInvoiceNumberNotBetween(String value1, String value2) {
            addCriterion("invoice_number not between", value1, value2, "invoiceNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberIsNull() {
            addCriterion("customer_number is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberIsNotNull() {
            addCriterion("customer_number is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberEqualTo(String value) {
            addCriterion("customer_number =", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotEqualTo(String value) {
            addCriterion("customer_number <>", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberGreaterThan(String value) {
            addCriterion("customer_number >", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberGreaterThanOrEqualTo(String value) {
            addCriterion("customer_number >=", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberLessThan(String value) {
            addCriterion("customer_number <", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberLessThanOrEqualTo(String value) {
            addCriterion("customer_number <=", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberLike(String value) {
            addCriterion("customer_number like", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotLike(String value) {
            addCriterion("customer_number not like", value, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberIn(List<String> values) {
            addCriterion("customer_number in", values, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotIn(List<String> values) {
            addCriterion("customer_number not in", values, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberBetween(String value1, String value2) {
            addCriterion("customer_number between", value1, value2, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNumberNotBetween(String value1, String value2) {
            addCriterion("customer_number not between", value1, value2, "customerNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxNumberIsNull() {
            addCriterion("customer_tax_number is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxNumberIsNotNull() {
            addCriterion("customer_tax_number is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxNumberEqualTo(String value) {
            addCriterion("customer_tax_number =", value, "customerTaxNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxNumberNotEqualTo(String value) {
            addCriterion("customer_tax_number <>", value, "customerTaxNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxNumberGreaterThan(String value) {
            addCriterion("customer_tax_number >", value, "customerTaxNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxNumberGreaterThanOrEqualTo(String value) {
            addCriterion("customer_tax_number >=", value, "customerTaxNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxNumberLessThan(String value) {
            addCriterion("customer_tax_number <", value, "customerTaxNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxNumberLessThanOrEqualTo(String value) {
            addCriterion("customer_tax_number <=", value, "customerTaxNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxNumberLike(String value) {
            addCriterion("customer_tax_number like", value, "customerTaxNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxNumberNotLike(String value) {
            addCriterion("customer_tax_number not like", value, "customerTaxNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxNumberIn(List<String> values) {
            addCriterion("customer_tax_number in", values, "customerTaxNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxNumberNotIn(List<String> values) {
            addCriterion("customer_tax_number not in", values, "customerTaxNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxNumberBetween(String value1, String value2) {
            addCriterion("customer_tax_number between", value1, value2, "customerTaxNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerTaxNumberNotBetween(String value1, String value2) {
            addCriterion("customer_tax_number not between", value1, value2, "customerTaxNumber");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountIsNull() {
            addCriterion("customer_bank_account is null");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountIsNotNull() {
            addCriterion("customer_bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountEqualTo(String value) {
            addCriterion("customer_bank_account =", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountNotEqualTo(String value) {
            addCriterion("customer_bank_account <>", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountGreaterThan(String value) {
            addCriterion("customer_bank_account >", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("customer_bank_account >=", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountLessThan(String value) {
            addCriterion("customer_bank_account <", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountLessThanOrEqualTo(String value) {
            addCriterion("customer_bank_account <=", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountLike(String value) {
            addCriterion("customer_bank_account like", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountNotLike(String value) {
            addCriterion("customer_bank_account not like", value, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountIn(List<String> values) {
            addCriterion("customer_bank_account in", values, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountNotIn(List<String> values) {
            addCriterion("customer_bank_account not in", values, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountBetween(String value1, String value2) {
            addCriterion("customer_bank_account between", value1, value2, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerBankAccountNotBetween(String value1, String value2) {
            addCriterion("customer_bank_account not between", value1, value2, "customerBankAccount");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressPhoneIsNull() {
            addCriterion("customer_address_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressPhoneIsNotNull() {
            addCriterion("customer_address_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressPhoneEqualTo(String value) {
            addCriterion("customer_address_phone =", value, "customerAddressPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressPhoneNotEqualTo(String value) {
            addCriterion("customer_address_phone <>", value, "customerAddressPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressPhoneGreaterThan(String value) {
            addCriterion("customer_address_phone >", value, "customerAddressPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_address_phone >=", value, "customerAddressPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressPhoneLessThan(String value) {
            addCriterion("customer_address_phone <", value, "customerAddressPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_address_phone <=", value, "customerAddressPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressPhoneLike(String value) {
            addCriterion("customer_address_phone like", value, "customerAddressPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressPhoneNotLike(String value) {
            addCriterion("customer_address_phone not like", value, "customerAddressPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressPhoneIn(List<String> values) {
            addCriterion("customer_address_phone in", values, "customerAddressPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressPhoneNotIn(List<String> values) {
            addCriterion("customer_address_phone not in", values, "customerAddressPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressPhoneBetween(String value1, String value2) {
            addCriterion("customer_address_phone between", value1, value2, "customerAddressPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_address_phone not between", value1, value2, "customerAddressPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeCodeIsNull() {
            addCriterion("invoice_type_code is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeCodeIsNotNull() {
            addCriterion("invoice_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeCodeEqualTo(String value) {
            addCriterion("invoice_type_code =", value, "invoiceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeCodeNotEqualTo(String value) {
            addCriterion("invoice_type_code <>", value, "invoiceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeCodeGreaterThan(String value) {
            addCriterion("invoice_type_code >", value, "invoiceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("invoice_type_code >=", value, "invoiceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeCodeLessThan(String value) {
            addCriterion("invoice_type_code <", value, "invoiceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("invoice_type_code <=", value, "invoiceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeCodeLike(String value) {
            addCriterion("invoice_type_code like", value, "invoiceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeCodeNotLike(String value) {
            addCriterion("invoice_type_code not like", value, "invoiceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeCodeIn(List<String> values) {
            addCriterion("invoice_type_code in", values, "invoiceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeCodeNotIn(List<String> values) {
            addCriterion("invoice_type_code not in", values, "invoiceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeCodeBetween(String value1, String value2) {
            addCriterion("invoice_type_code between", value1, value2, "invoiceTypeCode");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeCodeNotBetween(String value1, String value2) {
            addCriterion("invoice_type_code not between", value1, value2, "invoiceTypeCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("goods_code not between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIsNull() {
            addCriterion("goods_specification is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIsNotNull() {
            addCriterion("goods_specification is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationEqualTo(String value) {
            addCriterion("goods_specification =", value, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationNotEqualTo(String value) {
            addCriterion("goods_specification <>", value, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationGreaterThan(String value) {
            addCriterion("goods_specification >", value, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("goods_specification >=", value, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationLessThan(String value) {
            addCriterion("goods_specification <", value, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationLessThanOrEqualTo(String value) {
            addCriterion("goods_specification <=", value, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationLike(String value) {
            addCriterion("goods_specification like", value, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationNotLike(String value) {
            addCriterion("goods_specification not like", value, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationIn(List<String> values) {
            addCriterion("goods_specification in", values, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationNotIn(List<String> values) {
            addCriterion("goods_specification not in", values, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationBetween(String value1, String value2) {
            addCriterion("goods_specification between", value1, value2, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecificationNotBetween(String value1, String value2) {
            addCriterion("goods_specification not between", value1, value2, "goodsSpecification");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNull() {
            addCriterion("goods_unit is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNotNull() {
            addCriterion("goods_unit is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitEqualTo(String value) {
            addCriterion("goods_unit =", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotEqualTo(String value) {
            addCriterion("goods_unit <>", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThan(String value) {
            addCriterion("goods_unit >", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("goods_unit >=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThan(String value) {
            addCriterion("goods_unit <", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThanOrEqualTo(String value) {
            addCriterion("goods_unit <=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLike(String value) {
            addCriterion("goods_unit like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotLike(String value) {
            addCriterion("goods_unit not like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIn(List<String> values) {
            addCriterion("goods_unit in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotIn(List<String> values) {
            addCriterion("goods_unit not in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitBetween(String value1, String value2) {
            addCriterion("goods_unit between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotBetween(String value1, String value2) {
            addCriterion("goods_unit not between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("unit_price is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("unit_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(BigDecimal value) {
            addCriterion("unit_price =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("unit_price <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("unit_price >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(BigDecimal value) {
            addCriterion("unit_price <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("unit_price <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<BigDecimal> values) {
            addCriterion("unit_price in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("unit_price not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("unit_price not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(BigDecimal value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(BigDecimal value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(BigDecimal value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(BigDecimal value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<BigDecimal> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<BigDecimal> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountIsNull() {
            addCriterion("original_amount is null");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountIsNotNull() {
            addCriterion("original_amount is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountEqualTo(BigDecimal value) {
            addCriterion("original_amount =", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountNotEqualTo(BigDecimal value) {
            addCriterion("original_amount <>", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountGreaterThan(BigDecimal value) {
            addCriterion("original_amount >", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("original_amount >=", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountLessThan(BigDecimal value) {
            addCriterion("original_amount <", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("original_amount <=", value, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountIn(List<BigDecimal> values) {
            addCriterion("original_amount in", values, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountNotIn(List<BigDecimal> values) {
            addCriterion("original_amount not in", values, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_amount between", value1, value2, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_amount not between", value1, value2, "originalAmount");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(BigDecimal value) {
            addCriterion("tax_rate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(BigDecimal value) {
            addCriterion("tax_rate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(BigDecimal value) {
            addCriterion("tax_rate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_rate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(BigDecimal value) {
            addCriterion("tax_rate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_rate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<BigDecimal> values) {
            addCriterion("tax_rate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<BigDecimal> values) {
            addCriterion("tax_rate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_rate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_rate not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxIsNull() {
            addCriterion("tax is null");
            return (Criteria) this;
        }

        public Criteria andTaxIsNotNull() {
            addCriterion("tax is not null");
            return (Criteria) this;
        }

        public Criteria andTaxEqualTo(BigDecimal value) {
            addCriterion("tax =", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotEqualTo(BigDecimal value) {
            addCriterion("tax <>", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThan(BigDecimal value) {
            addCriterion("tax >", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax >=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThan(BigDecimal value) {
            addCriterion("tax <", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax <=", value, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxIn(List<BigDecimal> values) {
            addCriterion("tax in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotIn(List<BigDecimal> values) {
            addCriterion("tax not in", values, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax not between", value1, value2, "tax");
            return (Criteria) this;
        }

        public Criteria andOriginalTaxIsNull() {
            addCriterion("original_tax is null");
            return (Criteria) this;
        }

        public Criteria andOriginalTaxIsNotNull() {
            addCriterion("original_tax is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalTaxEqualTo(BigDecimal value) {
            addCriterion("original_tax =", value, "originalTax");
            return (Criteria) this;
        }

        public Criteria andOriginalTaxNotEqualTo(BigDecimal value) {
            addCriterion("original_tax <>", value, "originalTax");
            return (Criteria) this;
        }

        public Criteria andOriginalTaxGreaterThan(BigDecimal value) {
            addCriterion("original_tax >", value, "originalTax");
            return (Criteria) this;
        }

        public Criteria andOriginalTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("original_tax >=", value, "originalTax");
            return (Criteria) this;
        }

        public Criteria andOriginalTaxLessThan(BigDecimal value) {
            addCriterion("original_tax <", value, "originalTax");
            return (Criteria) this;
        }

        public Criteria andOriginalTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("original_tax <=", value, "originalTax");
            return (Criteria) this;
        }

        public Criteria andOriginalTaxIn(List<BigDecimal> values) {
            addCriterion("original_tax in", values, "originalTax");
            return (Criteria) this;
        }

        public Criteria andOriginalTaxNotIn(List<BigDecimal> values) {
            addCriterion("original_tax not in", values, "originalTax");
            return (Criteria) this;
        }

        public Criteria andOriginalTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_tax between", value1, value2, "originalTax");
            return (Criteria) this;
        }

        public Criteria andOriginalTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_tax not between", value1, value2, "originalTax");
            return (Criteria) this;
        }

        public Criteria andAmountTaxIsNull() {
            addCriterion("amount_tax is null");
            return (Criteria) this;
        }

        public Criteria andAmountTaxIsNotNull() {
            addCriterion("amount_tax is not null");
            return (Criteria) this;
        }

        public Criteria andAmountTaxEqualTo(BigDecimal value) {
            addCriterion("amount_tax =", value, "amountTax");
            return (Criteria) this;
        }

        public Criteria andAmountTaxNotEqualTo(BigDecimal value) {
            addCriterion("amount_tax <>", value, "amountTax");
            return (Criteria) this;
        }

        public Criteria andAmountTaxGreaterThan(BigDecimal value) {
            addCriterion("amount_tax >", value, "amountTax");
            return (Criteria) this;
        }

        public Criteria andAmountTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_tax >=", value, "amountTax");
            return (Criteria) this;
        }

        public Criteria andAmountTaxLessThan(BigDecimal value) {
            addCriterion("amount_tax <", value, "amountTax");
            return (Criteria) this;
        }

        public Criteria andAmountTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount_tax <=", value, "amountTax");
            return (Criteria) this;
        }

        public Criteria andAmountTaxIn(List<BigDecimal> values) {
            addCriterion("amount_tax in", values, "amountTax");
            return (Criteria) this;
        }

        public Criteria andAmountTaxNotIn(List<BigDecimal> values) {
            addCriterion("amount_tax not in", values, "amountTax");
            return (Criteria) this;
        }

        public Criteria andAmountTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_tax between", value1, value2, "amountTax");
            return (Criteria) this;
        }

        public Criteria andAmountTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount_tax not between", value1, value2, "amountTax");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountTaxIsNull() {
            addCriterion("original_amount_tax is null");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountTaxIsNotNull() {
            addCriterion("original_amount_tax is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountTaxEqualTo(BigDecimal value) {
            addCriterion("original_amount_tax =", value, "originalAmountTax");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountTaxNotEqualTo(BigDecimal value) {
            addCriterion("original_amount_tax <>", value, "originalAmountTax");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountTaxGreaterThan(BigDecimal value) {
            addCriterion("original_amount_tax >", value, "originalAmountTax");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("original_amount_tax >=", value, "originalAmountTax");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountTaxLessThan(BigDecimal value) {
            addCriterion("original_amount_tax <", value, "originalAmountTax");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("original_amount_tax <=", value, "originalAmountTax");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountTaxIn(List<BigDecimal> values) {
            addCriterion("original_amount_tax in", values, "originalAmountTax");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountTaxNotIn(List<BigDecimal> values) {
            addCriterion("original_amount_tax not in", values, "originalAmountTax");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_amount_tax between", value1, value2, "originalAmountTax");
            return (Criteria) this;
        }

        public Criteria andOriginalAmountTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("original_amount_tax not between", value1, value2, "originalAmountTax");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountTaxIsNull() {
            addCriterion("discount_amount_tax is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountTaxIsNotNull() {
            addCriterion("discount_amount_tax is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountTaxEqualTo(BigDecimal value) {
            addCriterion("discount_amount_tax =", value, "discountAmountTax");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountTaxNotEqualTo(BigDecimal value) {
            addCriterion("discount_amount_tax <>", value, "discountAmountTax");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountTaxGreaterThan(BigDecimal value) {
            addCriterion("discount_amount_tax >", value, "discountAmountTax");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount_tax >=", value, "discountAmountTax");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountTaxLessThan(BigDecimal value) {
            addCriterion("discount_amount_tax <", value, "discountAmountTax");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount_tax <=", value, "discountAmountTax");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountTaxIn(List<BigDecimal> values) {
            addCriterion("discount_amount_tax in", values, "discountAmountTax");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountTaxNotIn(List<BigDecimal> values) {
            addCriterion("discount_amount_tax not in", values, "discountAmountTax");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount_tax between", value1, value2, "discountAmountTax");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount_tax not between", value1, value2, "discountAmountTax");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNull() {
            addCriterion("discount_amount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIsNotNull() {
            addCriterion("discount_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountEqualTo(BigDecimal value) {
            addCriterion("discount_amount =", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotEqualTo(BigDecimal value) {
            addCriterion("discount_amount <>", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThan(BigDecimal value) {
            addCriterion("discount_amount >", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount >=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThan(BigDecimal value) {
            addCriterion("discount_amount <", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount_amount <=", value, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountIn(List<BigDecimal> values) {
            addCriterion("discount_amount in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotIn(List<BigDecimal> values) {
            addCriterion("discount_amount not in", values, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andDiscountAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount_amount not between", value1, value2, "discountAmount");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberIsNull() {
            addCriterion("cell_phone_number is null");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberIsNotNull() {
            addCriterion("cell_phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberEqualTo(String value) {
            addCriterion("cell_phone_number =", value, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberNotEqualTo(String value) {
            addCriterion("cell_phone_number <>", value, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberGreaterThan(String value) {
            addCriterion("cell_phone_number >", value, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cell_phone_number >=", value, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberLessThan(String value) {
            addCriterion("cell_phone_number <", value, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberLessThanOrEqualTo(String value) {
            addCriterion("cell_phone_number <=", value, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberLike(String value) {
            addCriterion("cell_phone_number like", value, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberNotLike(String value) {
            addCriterion("cell_phone_number not like", value, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberIn(List<String> values) {
            addCriterion("cell_phone_number in", values, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberNotIn(List<String> values) {
            addCriterion("cell_phone_number not in", values, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberBetween(String value1, String value2) {
            addCriterion("cell_phone_number between", value1, value2, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andCellPhoneNumberNotBetween(String value1, String value2) {
            addCriterion("cell_phone_number not between", value1, value2, "cellPhoneNumber");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("location is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("location is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("location =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("location <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("location >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("location >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("location <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("location <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("location like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("location not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("location in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("location not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("location between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("location not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIsNull() {
            addCriterion("detailed_address is null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIsNotNull() {
            addCriterion("detailed_address is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressEqualTo(String value) {
            addCriterion("detailed_address =", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotEqualTo(String value) {
            addCriterion("detailed_address <>", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressGreaterThan(String value) {
            addCriterion("detailed_address >", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressGreaterThanOrEqualTo(String value) {
            addCriterion("detailed_address >=", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLessThan(String value) {
            addCriterion("detailed_address <", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLessThanOrEqualTo(String value) {
            addCriterion("detailed_address <=", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLike(String value) {
            addCriterion("detailed_address like", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotLike(String value) {
            addCriterion("detailed_address not like", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIn(List<String> values) {
            addCriterion("detailed_address in", values, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotIn(List<String> values) {
            addCriterion("detailed_address not in", values, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressBetween(String value1, String value2) {
            addCriterion("detailed_address between", value1, value2, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotBetween(String value1, String value2) {
            addCriterion("detailed_address not between", value1, value2, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNull() {
            addCriterion("post_code is null");
            return (Criteria) this;
        }

        public Criteria andPostCodeIsNotNull() {
            addCriterion("post_code is not null");
            return (Criteria) this;
        }

        public Criteria andPostCodeEqualTo(String value) {
            addCriterion("post_code =", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotEqualTo(String value) {
            addCriterion("post_code <>", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThan(String value) {
            addCriterion("post_code >", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeGreaterThanOrEqualTo(String value) {
            addCriterion("post_code >=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThan(String value) {
            addCriterion("post_code <", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLessThanOrEqualTo(String value) {
            addCriterion("post_code <=", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeLike(String value) {
            addCriterion("post_code like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotLike(String value) {
            addCriterion("post_code not like", value, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeIn(List<String> values) {
            addCriterion("post_code in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotIn(List<String> values) {
            addCriterion("post_code not in", values, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeBetween(String value1, String value2) {
            addCriterion("post_code between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andPostCodeNotBetween(String value1, String value2) {
            addCriterion("post_code not between", value1, value2, "postCode");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSerialStatusIsNull() {
            addCriterion("serial_status is null");
            return (Criteria) this;
        }

        public Criteria andSerialStatusIsNotNull() {
            addCriterion("serial_status is not null");
            return (Criteria) this;
        }

        public Criteria andSerialStatusEqualTo(Integer value) {
            addCriterion("serial_status =", value, "serialStatus");
            return (Criteria) this;
        }

        public Criteria andSerialStatusNotEqualTo(Integer value) {
            addCriterion("serial_status <>", value, "serialStatus");
            return (Criteria) this;
        }

        public Criteria andSerialStatusGreaterThan(Integer value) {
            addCriterion("serial_status >", value, "serialStatus");
            return (Criteria) this;
        }

        public Criteria andSerialStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("serial_status >=", value, "serialStatus");
            return (Criteria) this;
        }

        public Criteria andSerialStatusLessThan(Integer value) {
            addCriterion("serial_status <", value, "serialStatus");
            return (Criteria) this;
        }

        public Criteria andSerialStatusLessThanOrEqualTo(Integer value) {
            addCriterion("serial_status <=", value, "serialStatus");
            return (Criteria) this;
        }

        public Criteria andSerialStatusIn(List<Integer> values) {
            addCriterion("serial_status in", values, "serialStatus");
            return (Criteria) this;
        }

        public Criteria andSerialStatusNotIn(List<Integer> values) {
            addCriterion("serial_status not in", values, "serialStatus");
            return (Criteria) this;
        }

        public Criteria andSerialStatusBetween(Integer value1, Integer value2) {
            addCriterion("serial_status between", value1, value2, "serialStatus");
            return (Criteria) this;
        }

        public Criteria andSerialStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("serial_status not between", value1, value2, "serialStatus");
            return (Criteria) this;
        }

        public Criteria andCommodityFlagIsNull() {
            addCriterion("commodity_flag is null");
            return (Criteria) this;
        }

        public Criteria andCommodityFlagIsNotNull() {
            addCriterion("commodity_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityFlagEqualTo(Short value) {
            addCriterion("commodity_flag =", value, "commodityFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityFlagNotEqualTo(Short value) {
            addCriterion("commodity_flag <>", value, "commodityFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityFlagGreaterThan(Short value) {
            addCriterion("commodity_flag >", value, "commodityFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("commodity_flag >=", value, "commodityFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityFlagLessThan(Short value) {
            addCriterion("commodity_flag <", value, "commodityFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityFlagLessThanOrEqualTo(Short value) {
            addCriterion("commodity_flag <=", value, "commodityFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityFlagIn(List<Short> values) {
            addCriterion("commodity_flag in", values, "commodityFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityFlagNotIn(List<Short> values) {
            addCriterion("commodity_flag not in", values, "commodityFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityFlagBetween(Short value1, Short value2) {
            addCriterion("commodity_flag between", value1, value2, "commodityFlag");
            return (Criteria) this;
        }

        public Criteria andCommodityFlagNotBetween(Short value1, Short value2) {
            addCriterion("commodity_flag not between", value1, value2, "commodityFlag");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Date value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Date value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Date value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Date value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Date value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Date> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Date> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Date value1, Date value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Date value1, Date value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Date value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Date value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Date value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Date value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Date value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Date> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Date> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Date value1, Date value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Date value1, Date value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {

        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        protected Criterion(String condition) {
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }


    }
}