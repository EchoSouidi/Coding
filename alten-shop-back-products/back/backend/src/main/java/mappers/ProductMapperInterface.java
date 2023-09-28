package mappers;

import model.ProductDao;
import data.ProductEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapperInterface {
    ProductDao entityToDao(ProductEntity productEntity);
    ProductEntity daoToEntity(ProductDao productDao);

}
