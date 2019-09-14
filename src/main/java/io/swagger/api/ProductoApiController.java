package io.swagger.api;

import io.swagger.model.PatchRequest;
import io.swagger.model.Producto;
import io.swagger.model.ProductoRsType;
import io.swagger.model.Producto_db;
import io.swagger.repository.ProductoRepository;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-11T01:59:35.650Z")

@Controller
public class ProductoApiController implements ProductoApi {
	
	@Autowired
	private ProductoRepository productoRepository;

	private static final Logger log = LoggerFactory.getLogger(ProductoApiController.class);

	private final ObjectMapper objectMapper;

	private final HttpServletRequest request;

	@org.springframework.beans.factory.annotation.Autowired
	public ProductoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
		this.objectMapper = objectMapper;
		this.request = request;
	}

	public ResponseEntity<ProductoRsType> actualizarProductoPorId(
			@ApiParam(value = "Cabecera estándar", required = true) @RequestHeader(value = "headerRq", required = true) String headerRq,
			@ApiParam(value = "sb2s1", required = true) @RequestHeader(value = "serviceID", required = true) String serviceID,
			@ApiParam(value = "Id del producto a inactivar", required = true) @PathVariable("idProducto") Integer idProducto,
			@ApiParam(value = "", required = true) @Valid @RequestBody PatchRequest jsonPatch) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<ProductoRsType>(objectMapper.readValue(
						"{  \"datosBasicos\" : {    \"datosdelObjeto\" : 6  },  \"status\" : {    \"statusDesc\" : \"statusDesc\",    \"statusCode\" : 0  }}",
						ProductoRsType.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<ProductoRsType>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<ProductoRsType>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<ProductoRsType> conultarProductoPorDescripcion(
			@ApiParam(value = "Cabecera estándar", required = true) @RequestHeader(value = "headerRq", required = true) String headerRq,
			@ApiParam(value = "sb2s1", required = true) @RequestHeader(value = "serviceID", required = true) String serviceID,
			@NotNull @ApiParam(value = "Descripcion del producto a consultar", required = true) @Valid @RequestParam(value = "descripcionProducto", required = true) String descripcionProducto) {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<ProductoRsType>(objectMapper.readValue("{  \"datosBasicos\" : {    \"datosdelObjeto\" : 6  },  \"status\" : {    \"statusDesc\" : \"statusDesc\",    \"statusCode\" : 0  }}", ProductoRsType.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<ProductoRsType>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }
		Producto_db prod = productoRepository.findOne(Integer.parseInt(descripcionProducto));
		System.out.println("pruebita:"+descripcionProducto);
		System.out.println("to_string: "+prod.toString());
		return new ResponseEntity<ProductoRsType>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<ProductoRsType> conultarProductoPorId(
			@ApiParam(value = "Cabecera estándar", required = true) @RequestHeader(value = "headerRq", required = true) String headerRq,
			@ApiParam(value = "sb2s1", required = true) @RequestHeader(value = "serviceID", required = true) String serviceID,
			@ApiParam(value = "Id del producto a consultar", required = true) @PathVariable("idProducto") Integer idProducto) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<ProductoRsType>(objectMapper.readValue(
						"{  \"datosBasicos\" : {    \"datosdelObjeto\" : 6  },  \"status\" : {    \"statusDesc\" : \"statusDesc\",    \"statusCode\" : 0  }}",
						ProductoRsType.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<ProductoRsType>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<ProductoRsType>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<ProductoRsType> conultarProductoPorNombre(
			@ApiParam(value = "Cabecera estándar", required = true) @RequestHeader(value = "headerRq", required = true) String headerRq,
			@ApiParam(value = "sb2s1", required = true) @RequestHeader(value = "serviceID", required = true) String serviceID,
			@NotNull @ApiParam(value = "Nombre del producto a consultar", required = true) @Valid @RequestParam(value = "nombreProducto", required = true) String nombreProducto) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<ProductoRsType>(objectMapper.readValue(
						"{  \"datosBasicos\" : {    \"datosdelObjeto\" : 6  },  \"status\" : {    \"statusDesc\" : \"statusDesc\",    \"statusCode\" : 0  }}",
						ProductoRsType.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<ProductoRsType>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<ProductoRsType>(HttpStatus.NOT_IMPLEMENTED);
	}

	public ResponseEntity<ProductoRsType> registrarProducto(
			@ApiParam(value = "Cabecera estándar", required = true) @RequestHeader(value = "headerRq", required = true) String headerRq,
			@ApiParam(value = "soms1", required = true) @RequestHeader(value = "serviceID", required = true) String serviceID,
			@ApiParam(value = "Producto a registrar", required = true) @Valid @RequestBody Producto producto) {
		String accept = request.getHeader("Accept");
		if (accept != null && accept.contains("application/json")) {
			try {
				return new ResponseEntity<ProductoRsType>(objectMapper.readValue(
						"{  \"datosBasicos\" : {    \"datosdelObjeto\" : 6  },  \"status\" : {    \"statusDesc\" : \"statusDesc\",    \"statusCode\" : 0  }}",
						ProductoRsType.class), HttpStatus.NOT_IMPLEMENTED);
			} catch (IOException e) {
				log.error("Couldn't serialize response for content type application/json", e);
				return new ResponseEntity<ProductoRsType>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}

		return new ResponseEntity<ProductoRsType>(HttpStatus.NOT_IMPLEMENTED);
	}

}
