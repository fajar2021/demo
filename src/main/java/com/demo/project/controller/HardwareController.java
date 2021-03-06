package com.demo.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.project.entity.Hardware;
import com.demo.project.service.HardwareService;
import com.demo.project.util.Response;

@RestController
@RequestMapping(value = "hardware")

public class HardwareController {

	    @Autowired
	    HardwareService hardwareService;

	    private String service = "Hardware";

	    @PostMapping /*Komunikasi API dengan jenis POST*/
	    ResponseEntity<Response> create (@RequestBody @Validated Hardware hardware) /*Mengambil Request data dari Body dan melakukan Proses Validasi*/
	    {
	        /*Informasi Tentang Nama Method*/
	        String nameofCurrMethod = new Throwable()
	                .getStackTrace()[0]
	                .getMethodName();
	        /*Memanggil Class Response yang telah dibuat*/
	        Response response = new Response();
	        response.setService(this.getClass().getName() + nameofCurrMethod);
	        response.setMessage("Berhasil Membuat Data");

	        /*Set Data Dari Database*/
	        response.setData(hardwareService.create(hardware));

	        return  ResponseEntity
	                .status(HttpStatus.OK)
	                .contentType(MediaType.APPLICATION_JSON)
	                .body(response);
	    }

	    @PutMapping/*Komunikasi API dengan jenis PUT*/
	    ResponseEntity<Response> update (@PathVariable ("id")Long id, @RequestBody @Validated Hardware hardware) /*Mengambil Request data dari Body dan melakukan Proses Validasi, diseleksi berdasarkan id*/
	    {
	        /*Informasi Tentang Nama Method*/
	        String nameofCurrMethod = new Throwable()
	                .getStackTrace()[0]
	                .getMethodName();

	        Response response = new Response();
	        response.setService(this.getClass().getName() + nameofCurrMethod);
	        response.setMessage("Berhasil Update Data");

	        /*Set Data Dari Database*/
	        response.setData(hardwareService.update(id, hardware));

	        return  ResponseEntity
	                .status(HttpStatus.OK)
	                .contentType(MediaType.APPLICATION_JSON)
	                .body(response);
	    }

	    @GetMapping(value = "id")/*Komunikasi API dengan jenis GET*/
	    ResponseEntity<Response> getById (@PathVariable ("id")Long id)/*Mengambil Request data dari Berdasarkan id*/
	    {
	        /*Informasi Tentang Nama Method*/
	        String nameofCurrMethod = new Throwable()
	                .getStackTrace()[0]
	                .getMethodName();
	        /*Memanggil Class Response yang telah dibuat*/
	        Response response = new Response();
	        response.setService(this.getClass().getName() + nameofCurrMethod);
	        response.setMessage("Berhasil Mengambil Data Berdasarkan Id");

	        /*Set Data Dari Database*/
	        response.setData(hardwareService.findById(id));

	        return  ResponseEntity
	                .status(HttpStatus.OK)
	                .contentType(MediaType.APPLICATION_JSON)
	                .body(response);
	    }

	    @GetMapping/*Komunikasi API dengan jenis GET*/
	    ResponseEntity<Response> findAll ()
	    {
	        /*Informasi Tentang Nama Method*/
	        String nameofCurrMethod = new Throwable()
	                .getStackTrace()[0]
	                .getMethodName();
	        /*Memanggil Class Response yang telah dibuat*/
	        Response response = new Response();
	        response.setService(this.getClass().getName() + nameofCurrMethod);
	        response.setMessage("Berhasil Menampilkan Seluruh Data");

	        /*Set Data Dari Database*/
	        response.setData(hardwareService.findAll());

	        return  ResponseEntity
	                .status(HttpStatus.OK)
	                .contentType(MediaType.APPLICATION_JSON)
	                .body(response);
	    }
	    
	    @DeleteMapping(value = "id")/*Komunikasi API dengan jenis GET*/
	    ResponseEntity<Response> deleteById (@PathVariable ("id")Long id)/*Mengambil Request data dari Berdasarkan id*/
	    {
	        /*Informasi Tentang Nama Method*/
	        String nameofCurrMethod = new Throwable()
	                .getStackTrace()[0]
	                .getMethodName();

	        /*Memanggil Class Response yang telah dibuat*/
	        Response response = new Response();
	        response.setService(this.getClass().getName() + nameofCurrMethod);
	        response.setMessage("Data Berhasil dihapus");
	        response.setData(hardwareService.findById(id));

	        hardwareService.delete(id);

	        return  ResponseEntity
	                .status(HttpStatus.OK)
	                .contentType(MediaType.APPLICATION_JSON)
	                .body(response);
	    }
}
