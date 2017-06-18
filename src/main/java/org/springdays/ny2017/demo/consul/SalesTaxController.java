package org.springdays.ny2017.demo.consul;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class SalesTaxController {
	
	@Value("${taxrate}")
	private Double raxRate;

	@RequestMapping("/tax/{price}")
	public Double calculateTax(@PathVariable(value = "price") Double price ) {
		return price * raxRate;
	}
}
