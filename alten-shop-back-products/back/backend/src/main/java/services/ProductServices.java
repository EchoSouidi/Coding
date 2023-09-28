package services;

import model.ProductDao;
import data.ProductEntity;
import mappers.ProductMapperInterfaceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProductRepo;

@Service
public class ProductServices {
    ProductMapperInterfaceImpl productMapper = new ProductMapperInterfaceImpl();
    @Autowired
    private ProductRepo productRepository;
    public void saveProduct(ProductDao product){
        ProductEntity productEntity = productMapper.daoToEntity(product);
        productRepository.save(productEntity);

    }
}
