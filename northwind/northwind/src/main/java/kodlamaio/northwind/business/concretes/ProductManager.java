package kodlamaio.northwind.business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.Dtos.ProductWithCategoryDto;
import kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {
	
	private ProductDao productdao;
	
	@Autowired //burası yeni nesil projelerde kullanılıyor
	public ProductManager(ProductDao productdao) {
		super();
		this.productdao = productdao;
	}


	@Override
	public DataResult<List<Product>> getAll() {
		
		return new SuccessDataResult<List<Product>>
		(this.productdao.findAll(),"Data listendi");
				
	}


	@Override
	public Result add(Product product) {
		this.productdao.save(product);
		return new SuccessDataResult<Object>("ürün eklendi");
	}



	@Override
	public DataResult<Product> getByProductName(String productName) {
		return new SuccessDataResult<Product>
		(this.productdao.getByProductName(productName),"Data listendi");
				
	}


	@Override
	public DataResult<Product> getByProductNameAndCategory(String productName, int categoryId) {
		//business codes
		
		return new SuccessDataResult<Product>
		(this.productdao.getByProductNameAndCategory_CategoryId(productName,categoryId),"Data listelendi.");
				
	}
	
	@Override
	public DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId) {
		
		return new SuccessDataResult<List<Product>>
		(this.productdao.getByProductNameOrCategory_CategoryId(productName, categoryId),"Data listendi");
				
	}


	@Override
	public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
		return new SuccessDataResult<List<Product>>
		(this.productdao.getByCategoryIn(categories),"Data listendi");
				
	}


	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDataResult<List<Product>>
		(this.productdao.getByProductNameContains(productName),"Data listendi");
				
	}


	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return new SuccessDataResult<List<Product>>
		(this.productdao.getByProductNameStartsWith(productName),"Data listendi");
				
	}


	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>
		(this.productdao.getByNameAndCategory(productName,categoryId),"Data listendi");
				
	}


	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {
		
		Pageable pageable = PageRequest.of(pageNo-1, pageSize);
		
		return new SuccessDataResult<List<Product>>
		(this.productdao.findAll(pageable).getContent());
	}


	@Override
	public DataResult<List<Product>> getAllSorted() {
		Sort sort = Sort.by(Sort.Direction.ASC,"productName");
		return new SuccessDataResult<List<Product>>
		(this.productdao.findAll(sort),"Başarılı");
		
	}


	@Override
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
		return new SuccessDataResult<List<ProductWithCategoryDto>>
		(this.productdao.getProductWithCategoryDetails(),"Data listelendi");
	}
	

}
