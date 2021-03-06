package com.park.einvoice.controller.eih5;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.park.einvoice.service.eih5.HasInvoiceService;

@Controller
@RequestMapping("/hasInvoice")
public class HasInvoiceController {
	
	@Resource(name="hasInvoiceServiceImpl")
	private HasInvoiceService hasInvoiceService;
	
	@ResponseBody
	@RequestMapping(value="/getHasInvoice", produces="text/html;charset=UTF-8")
	public String getHasInvoiceList(HttpServletRequest request, HttpServletResponse response){
		String requestStr = request.getParameter("params");
		return hasInvoiceService.getHasInvoiceList(requestStr);
	}
	
	@ResponseBody
	@RequestMapping(value="/getHasInvoiceDetail", produces="text/html;charset=UTF-8")
	public String getHasInvoiceDetail(HttpServletRequest request, HttpServletResponse response){
		String requestStr = request.getParameter("params");
		return hasInvoiceService.getHasInvoiceDetail(requestStr);
	}
	
}
