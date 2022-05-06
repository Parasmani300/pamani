package com.web.paras.mani.pamani.db;

public class InsertQuery {
    public static final String INSERT_IN_ORDER =
            "INSERT INTO ORDERS(" +
                    " orderId," +
                    " customerId," +
                    " orderNumber," +
                    " paymentId," +
                    " orderDate," +
                    " shipDate," +
                    " requiredDate," +
                    " shipperId," +
                    " freight," +
                    " saleTax," +
                    " transcatStatus," +
                    " errLoc," +
                    " errMsg," +
                    " fulfiled," +
                    " deleted," +
                    " paid," +
                    " paymentDate" +
                    " )" +
            "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final  String INSERT_PAYMENT = "Insert into Payments(" +
            " PAYMENTID," +
            " PAYMENTTYPE," +
            " ALLOWED)" +
            " VALUES(" +
            "?,?,?)";
    
    public static final String INSERT_ORDERDETAILS =
            "Insert into OrderDetails(" +
                    "    orderID," +
                    "    productID," +
                    "    orderNumber," +
                    "    price," +
                    "    quantity," +
                    "    discount," +
                    "    total," +
                    "    IdSku," +
                    "    orderSize," +
                    "    color," +
                    "    fulfilled," +
                    "    shipDate," +
                    "    orderDetailId," +
                    "    billDate" +
                    ") VALUES(" +
                    "?,?,?,?,?,?,?,?,?,?,?,?,?,?"+
                    ")";

    public static final String INSERT_PRODUCT =
            "Insert into Products(" +
                    "    productID," +
                    "    sku," +
                    "    idSku," +
                    "    vendorProductId," +
                    "    productName," +
                    "    productDescription," +
                    "    supplierId," +
                    "    categoryId," +
                    "    quantityPerUnit," +
                    "    unitPrice," +
                    "    MSRP," +
                    "    availableSizes," +
                    "    availableColors ," +
                    "    productSize," +
                    "    color," +
                    "    discount," +
                    "    unitWeight ," +
                    "    unitInStock," +
                    "    unitInOrder ," +
                    "    reorderLevel," +
                    "    productAvailable ," +
                    "    discountAvailable," +
                    "    currentOrder," +
                    "    picture," +
                    "    ranking," +
                    "    note" +
                    ") VALUES(" +
                    "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"+
                    ")";

    public static final String INSERT_SUPPLIER =
                        "Insert into Suppliers(" +
                                "supplierId," +
                                "companyName," +
                                "contactFName," +
                                "contactLName ," +
                                "contactTitle," +
                                "address1," +
                                "address2 ," +
                                "city ," +
                                "state ," +
                                "postalCode," +
                                "country ," +
                                "phone," +
                                "fax," +
                                "email ," +
                                "url," +
                                "paymentMethods," +
                                "discountType," +
                                "typeGoods," +
                                "notes ," +
                                "discountAvailable ," +
                                "currentOrder ," +
                                "logo ," +
                                "customerId," +
                                "sizeUrl" +
                                ") VALUES(" +
                                "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"+
                                ")";

    public static final String INSERT_CUSTOMERS =
                "Insert into Customers(" +
                        " customerID," +
                        "  firstName," +
                        "  lastName," +
                        "  customerClass," +
                        "  room," +
                        "  building," +
                        "  address1," +
                        "  address2," +
                        "  city," +
                        "  state," +
                        "  postalCode," +
                        " country," +
                        "  phone," +
                        " email," +
                        " voiceMail," +
                        " password," +
                        " creditCard," +
                        " creditCardTypeID," +
                        " cardExpMo," +
                        " cardExpYr ," +
                        " billingAddress ," +
                        " billingCity," +
                        " billingRegion," +
                        " billingPostalCode ," +
                        " billingCountry ," +
                        " shipAddress," +
                        " shipCity ," +
                        " shipRegion ," +
                        " shipPostalCode," +
                        " shipCountry," +
                        " dateEntered)" +
                        " VALUES(" +
                        "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"+
                        " )";

    public static final String INSERT_UPC_EAN =
            "Insert into UPC_EAN " +
                    "    (UPC, " +
                    "    UPC_SUPPLEMENT," +
                    "    SKU," +
                    "    UPC_DESC," +
                    "    PRIMARY_UPC_IND," +
                    "    UPC_TYPE," +
                    "    MANUFACTURER," +
                    "    VAR_TYPE," +
                    "    LAST_UPDATED_DATE)" +
                    "    values (?," +
                    "    ?," +
                    "    ?," +
                    "    ?," +
                    "    ?," +
                    "    ?," +
                    "    ?," +
                    "    ?," +
                    "    trunc(sysdate)" +
                    "    )";

    public static String INSERT_PRODUCT_ITEM =
            "Insert into PRODUCTS (SKU,SKU_DESC,SHORT_DESC,DEPT,CLASS,SUBCLASS,LAST_UPDATED) values\n" +
                    "(?,?,?,?,?,?,?)";

    public static final String INSERT_PRODUCT_ATTRIBUTES =
            "Insert into PRODUCT_ATTRIBUTES (SKU," +
                    "SKU_NOTES," +
                    "RATING," +
                    "COLOR," +
                    "PRODUCT_SIZE," +
                    "SKU_STATUS," +
                    "STREET_DATE," +
                    "IN_STOCK_DATE," +
                    "OUT_STOCK_DATE," +
                    "MAP," +
                    "MAP_START_DATE," +
                    "MAP_END_DATE," +
                    "PERFORMANCE_CODE," +
                    "URL_SMALL," +
                    "URL_BIG," +
                    "LAST_UPDATED_DATE) " +
                    "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static final String INSERT_PRODUCT_SUPPLIER =
                    "Insert into PRODUCT_SUPPLIER (SKU,SUPPLIER,PRIMARY_SUPPLIER_IND,RTV_IND,LAST_UPDATED)" +
                    " values (?,?,?,?,?)";

    public  static  final String INSERT_PRODUCT_IN_STORE =
            "Insert into PRODUCT_STORE " +
                    "(SKU," +
                    "STORE," +
                    "PRIMARY_SUPPLIER," +
                    "UNIT_RETAIL," +
                    "STOCK_ON_HAND," +
                    "IN_TRANSIT_QTY," +
                    "TSF_RESERVED_QTY," +
                    "TSF_EXPECTED_QTY," +
                    "RTV_QTY," +
                    "NON_SELLABLE_QTY," +
                    "CLEAR_IND," +
                    "TAXABLE_IND," +
                    "STATUS," +
                    "STATUS_UPDATE_DATE," +
                    "LAST_SALES_EXPORT_DATE," +
                    "REPAIR_SERVICE_IND," +
                    "UNIT_COST) " +
                    "values " +
                    "(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

    public static  final String INSERT_SUPPLIER_NEW =
            "Insert into SUPPLIER (SUPPLIER,SUPPLIERNAME,CONTACT_NAME,ADDRESS,CONTACT_PHONE,SUPPLIER_STATUS,LANG,EMAIL,FAX,WEBSITE)" +
                    " values " +
                    "(?," +
                    "?," +
                    "?," +
                    "?," +
                    "?," +
                    "?," +
                    "?," +
                    "?," +
                    "?," +
                    "?)";

    public  static  final String INSERT_STORE =
            "Insert into STORE (STORE,STORE_NAME,STORE_ADDRESS,STORE_PHONE,STORE_EMAIL,CITY,DISTRICT,STATE,ZIP,COUNTRY,LAST_UPDATED_DATE) values (?,?,?,?,?,?,?,?,?,?,?)";

}
