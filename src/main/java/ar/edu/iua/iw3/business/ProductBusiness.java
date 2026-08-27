package ar.edu.iua.iw3.business;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import ar.edu.iua.iw3.business.exception.BusinessException;
import ar.edu.iua.iw3.business.exception.FoundException;
import ar.edu.iua.iw3.model.Product;

@Service // Este es el candidato a instanciar cuando alguien quiera algo de tipo IProductBusiness
public class ProductBusiness implements IProductBusiness {

    @Override
    public Product add(Product product) throws FoundException, BusinessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(long id) throws NotFoundException, BusinessException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Product> list() throws BusinessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product load(long id) throws NotFoundException, BusinessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product load(String product) throws NotFoundException, BusinessException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Product update(Product product) throws NotFoundException, BusinessException {
        // TODO Auto-generated method stub
        return null;
    }

}
