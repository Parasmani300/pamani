package com.web.paras.mani.pamani.controller;

import com.web.paras.mani.pamani.bean.*;
import com.web.paras.mani.pamani.dao.*;
import com.web.paras.mani.pamani.db.InsertQuery;
import com.web.paras.mani.pamani.db.ProductInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    ProductJdbcDao productJdbcDao;

    @Autowired
    SkuPoolJdbcDao skuPoolJdbcDao;

    @Autowired
    UpcJdbcDao upcJdbcDao;

    @Autowired
    ProductItemJdbcDao productItemJdbcDao;

    @Autowired
    ProductAttributesJdbcDao productAttributesJdbcDao;

    @Autowired
    ProductSupplierJdbcDao productSupplierJdbcDao;

    @Autowired
    ProductStoreJdbcDao productStoreJdbcDao;

    @GetMapping
    public List<Product> getProducts()
    {
        return productJdbcDao.getProducts();
    }

    @PostMapping
    public ProductInfo postProduct(@RequestBody ProductInfo productInfo)
    {
        List<SkuPool> mySkuList = skuPoolJdbcDao.generateSku();
        int sku = mySkuList.get(0).getSku();
        System.out.println(sku);
        UPC upc = new UPC(
                productInfo.getUpc(),
                productInfo.getUpc_supplement(),
                sku,
                productInfo.getUpc_desc(),
                productInfo.getPrimaryUpcInd(),
                productInfo.getUpcType(),
                productInfo.getManufacturer(),
                productInfo.getVarType(),
                productInfo.getLastUpdateDate()
        );

        if(upcJdbcDao.setUpc(upc) == false)
        {
//            ProductInfo errInfo = new ProductInfo();
//            errInfo.setErrMsg();
            return  new ProductInfo("UPC already exists");
        }

        ProductItem productItem = new ProductItem(
                sku,
                productInfo.getSku_desc(),
                productInfo.getShort_desc(),
                productInfo.getDept(),
                productInfo.getProductClass(),
                productInfo.getSubClass(),
                productInfo.getLastUpdateDate()
        );
        productItemJdbcDao.setProductItem(productItem);

        ProductAttributes productAttributes = new ProductAttributes(
                sku,
                productInfo.getSku_desc(),
                productInfo.getRating(),
                productInfo.getColor(),
                productInfo.getSize(),
                productInfo.getSkuStatus(),
                productInfo.getMapStreetDate(),
                productInfo.getInStockDate(),
                productInfo.getOutStockDate(),
                productInfo.getMap(),
                productInfo.getMapStartDate(),
                productInfo.getMapEndDate(),
                productInfo.getPerfCode(),
                productInfo.getSmallUrl(),
                productInfo.getBigUrl(),
                productInfo.getLastUpdateDate()
        );
        productAttributesJdbcDao.setProductAttributes(productAttributes);

        ProductSupplier productSupplier = new ProductSupplier(
          sku,
          productInfo.getSupplier(),
          productInfo.getPrimarySupplier(),
          productInfo.getRtvInd(),
          productInfo.getLastUpdateDate()
        );
        productSupplierJdbcDao.setSupplier(productSupplier);

        ProductStore productStore = new ProductStore(
                sku,
                productInfo.getStore(),
                productInfo.getSupplier(),
                productInfo.getUnitRetail(),
                productInfo.getUnitCost(),
                productInfo.getStockOnHand(),
                0,
                0,
                0,
                0,
                0,
                productInfo.getClearInd(),
                "N",
                productInfo.getStatus(),
                productInfo.getStatusUpdateDate(),
                productInfo.getLastSalesExportDate(),
                productInfo.getRepairServiceInd()
        );
        productStoreJdbcDao.setProductStore(productStore);
        productInfo.setSku(sku);
        return productInfo;
    }
}
