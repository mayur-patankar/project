package com.finalClickonix.controllers;

import java.nio.file.Files;
import java.util.List;
import java.util.Optional;

import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.finalClickonix.dto.IdDTO;
import com.finalClickonix.dto.ProdListDTO;
import com.finalClickonix.dto.ProductDTO;
import com.finalClickonix.entity.Product;
import com.finalClickonix.repository.CustProdRepo;
import com.finalClickonix.repository.ProductRepo;
import com.finalClickonix.services.StorageService;

@CrossOrigin
@RestController
public class ProductController {
	
	@Autowired
	ProductRepo pr;
	
	@Autowired
	private StorageService storageService;
	
	@Autowired
	CustProdRepo cpr;

	@PostMapping("/addProduct")
	public void addProduct(ProductDTO pdto) {
		MultipartFile file = pdto.getPrpic();
		String dest = storageService.store(file);
		System.out.println(pdto.getPrpic());
		System.out.println(pdto.getPrname());
		System.out.println(pdto.getPrquant());
		Product product = ProductDTO.toEntity(pdto);
		System.out.println(product.getPic());
		System.out.println(product.getPname());
		System.out.println(product.getPquant());
		product.setPic(dest);
		System.out.println(product.getPic());
		System.out.println("sid"+pdto.getPrsid());
		System.out.println("sid"+product.getSid());
		pr.save(product);
	}
	
	@PostMapping("/getProductBySid")
	public List<Product> getProductBySid(@RequestBody IdDTO id)
	{
		int i = id.getId();
		return cpr.findProdBySid(i);
	}
	
	@PostMapping("/updateProducts")
	public void updateProducts(Product p)
	{
		cpr.updateProd(p);
	}
	
	@PostMapping("/getSingleProduct")
	public Optional<Product> getSingleProduct(@RequestBody IdDTO id)
	{
		int iid = id.getId();
		Optional<Product> p = pr.findById(iid);
		return p;
	}
	
	@GetMapping("/getAllProds")
	public List<Product> getAllProds()
	{
		return pr.findAll(); 
	}
	
	@PostMapping("/getCustomProds")
	public List<Product> getCustomProds(@RequestBody List<Integer> ll)
	{
		//List<Integer> ll = pl.getList();
		return cpr.getProdListByPIDs(ll);
	}
}
