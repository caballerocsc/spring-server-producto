/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.PatchRequest;
import io.swagger.model.Producto;
import io.swagger.model.ProductoRsType;
import io.swagger.model.Producto_db;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-09-11T01:59:35.650Z")

@Api(value = "producto", description = "the producto API")
public interface ProductoApi {

    @ApiOperation(value = "Actualizar Inactivar Producto por ID", nickname = "actualizarProductoPorId", notes = "Actualizar un producto", response = ProductoRsType.class, tags={ "Producto", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = ProductoRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = ProductoRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = ProductoRsType.class) })
    @RequestMapping(value = "/producto/{idProducto}",
        produces = { "application/json" }, 
        method = RequestMethod.PATCH)
    ResponseEntity<ProductoRsType> actualizarProductoPorId(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "sb2s1" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Id del producto a inactivar",required=true) @PathVariable("idProducto") Integer idProducto,@ApiParam(value = "" ,required=true )  @Valid @RequestBody PatchRequest jsonPatch);


    @ApiOperation(value = "Consultar Producto por Descripcion", nickname = "conultarProductoPorDescripcion", notes = "Retorna un producto", response = Producto_db.class, tags={ "Producto", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = ProductoRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = ProductoRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = ProductoRsType.class) })
    @RequestMapping(value = "/producto/consultarPorDescripcion",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Producto_db> conultarProductoPorDescripcion(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "sb2s1" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@NotNull @ApiParam(value = "Descripcion del producto a consultar", required = true) @Valid @RequestParam(value = "descripcionProducto", required = true) String descripcionProducto);


    @ApiOperation(value = "Consultar Producto por ID", nickname = "conultarProductoPorId", notes = "Retorna un producto", response = ProductoRsType.class, tags={ "Producto", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = ProductoRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = ProductoRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = ProductoRsType.class) })
    @RequestMapping(value = "/producto/{idProducto}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ProductoRsType> conultarProductoPorId(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "sb2s1" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Id del producto a consultar",required=true) @PathVariable("idProducto") Integer idProducto);


    @ApiOperation(value = "Consultar Producto por nombre", nickname = "conultarProductoPorNombre", notes = "Retorna un producto", response = ProductoRsType.class, tags={ "Producto", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = ProductoRsType.class),
        @ApiResponse(code = 400, message = "Bad request", response = ProductoRsType.class),
        @ApiResponse(code = 404, message = "Not found", response = ProductoRsType.class) })
    @RequestMapping(value = "/producto/consultarPorNombre",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ProductoRsType> conultarProductoPorNombre(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "sb2s1" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@NotNull @ApiParam(value = "Nombre del producto a consultar", required = true) @Valid @RequestParam(value = "nombreProducto", required = true) String nombreProducto);


    @ApiOperation(value = "Registrar un Producto", nickname = "registrarProducto", notes = "", response = Producto_db.class, tags={ "Producto", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "EXITO", response = Producto_db.class),
        @ApiResponse(code = 400, message = "Bad request", response = Producto_db.class),
        @ApiResponse(code = 404, message = "Not found", response = Producto_db.class) })
    @RequestMapping(value = "/producto",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    Producto_db registrarProducto(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "soms1" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Producto a registrar" ,required=true )  @Valid @RequestBody Producto_db producto);

}
