package com.web.paras.mani.pamani.db;

public class SelectQuery {
    public static final String GET_PRODUCTS_IN_STORE =
            "Select " +
                    "    p.sku," +
                    "    p.sku_desc," +
                    "    p.short_desc," +
                    "    p.dept," +
                    "    p.class," +
                    "    p.subclass," +
                    "    p.last_updated," +
                    "    ps.store," +
                    "    ps.primary_supplier," +
                    "    ps.unit_retail," +
                    "    ps.unit_cost," +
                    "    ps.stock_on_hand," +
                    "    ps.tsf_reserved_qty," +
                    "    ps.tsf_expected_qty," +
                    "    ps.rtv_qty," +
                    "    ps.non_sellable_qty," +
                    "    ps.clear_ind," +
                    "    ps.status," +
                    "    ps.status_update_date," +
                    "    ps.last_sales_export_date," +
                    "    ps.repair_service_ind," +
                    "    upc.upc," +
                    "    pa.rating," +
                    "    pa.color," +
                    "    pa.PRODUCT_SIZE," +
                    "    pa.PERFORMANCE_CODE," +
                    "    pa.url_small," +
                    "    pa.url_big," +
                    "    pa.map," +
                    "    pa.MAP_START_DATE," +
                    "    pa.MAP_END_DATE," +
                    "    pa.STREET_DATE," +
                    "    pa.IN_STOCK_DATE," +
                    "    pa.OUT_STOCK_DATE " +
                    "from Products p," +
                    "            Product_attributes pa," +
                    "            Product_store ps," +
                    "            Upc_ean upc" +
                    "            where p.sku = ps.sku" +
                    "            and p.sku = pa.sku" +
                    "            and upc.sku = p.sku" +
                    "            and rownum <= 10" +
                    "            order by LAST_UPDATED";

    public static final String GET_UPC =
            "Select * from UPC_EAN";

    public static final String GET_PRODUCTS =
            "Select SKU,SKU_DESC,SHORT_DESC,DEPT,CLASS,SUBCLASS,LAST_UPDATED from Products where rownum <= 10";

    public static final String GET_PRODUCT_ATTRIBUTES =
            "Select SKU,SKU_NOTES,RATING,COLOR,PRODUCT_SIZE,SKU_STATUS,STREET_DATE,IN_STOCK_DATE,OUT_STOCK_DATE,MAP,MAP_START_DATE,MAP_END_DATE,PERFORMANCE_CODE,\n" +
                    "URL_SMALL,URL_BIG,LAST_UPDATED_DATE from Product_Attributes where rownum <= 10";

    public static final String GET_PRODUCT_SUPPLIER =
            "Select SKU,SUPPLIER,PRIMARY_SUPPLIER_IND,RTV_IND,LAST_UPDATED from Product_Supplier";

    public  static final  String GET_PRODUCT_IN_STORE =
            "Select SKU,STORE,primary_supplier core_supplier,unit_retail,unit_cost,stock_on_hand,in_transit_qty,tsf_expected_qty,tsf_reserved_qty,rtv_qty,non_sellable_qty,clear_ind,taxable_ind,status,status_update_date,last_sales_export_date,repair_service_ind from Product_Store where rownum <= 10";

    public static  final String CHECK_DUP_UPC_EXISTS =
            "Select * from UPC_EAN where upc= ? and rownum <= 1";

    public static final String GET_SUPPLIERS =
            "Select Supplier,SUPPLIERNAME,CONTACT_NAME,ADDRESS,CONTACT_PHONE,SUPPLIER_STATUS,LANG,EMAIL,FAX,WEBSITE from Supplier";

    public  static  final String GET_STORE =
            "Select store,STORE_NAME,STORE_ADDRESS,STORE_PHONE,STORE_EMAIL,CITY,DISTRICT,STATE,ZIP,COUNTRY,LAST_UPDATED_DATE from Store where rownum <= 10";
    public static final String GET_DEPT =
            "Select Dept,dept_name,buyer,merch,PROFIT_CALC_TYPE,purchase_type,group_no,bud_int,bud_mkup,total_market_amt from Deps";
    public static final String GET_CLASS =
            "Select dept,class product_class,class_name from Class where dept = ?";
    public static final String GET_SUBCLASS =
            "Select dept,class product_class, subclass,subclass_name sub_class_name from Subclass where dept = ? and class = ?";

}
