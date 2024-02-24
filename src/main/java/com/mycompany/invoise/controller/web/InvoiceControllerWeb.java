package com.mycompany.invoise.controller.web;

import com.mycompany.invoise.controller.InvoiceControllerInterface;
import com.mycompany.invoise.entity.Invoice;
import com.mycompany.invoise.service.InvoiceServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class InvoiceControllerWeb implements InvoiceControllerInterface {

    public InvoiceControllerWeb(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }

    //@Autowired
    private final InvoiceServiceInterface invoiceService;

    public InvoiceServiceInterface getInvoiceService() {
        return invoiceService;
    }

    /*public void setInvoiceService(InvoiceServiceInterface invoiceService) {
        this.invoiceService = invoiceService;
    }*/

    public void createInvoice(){
        //System.out.println("What is the customer name?");
        //Scanner sc=new Scanner(System.in);
        String customerName="Tesla";
        Invoice invoice=new Invoice();
        invoice.setCustomerName(customerName);
        //InvoiceServiceMichel invoiceServiceMichel =new InvoiceServiceMichel();
        invoiceService.createInvoice(invoice);
    }
}
