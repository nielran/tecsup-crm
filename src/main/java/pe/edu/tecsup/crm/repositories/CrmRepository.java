package pe.edu.tecsup.crm.repositories;

import com.sforce.soap2.TECActualizarProductoRequestCls;
import com.sforce.soap3.ObjRequest;
import com.sforce.soap3.ObjectFactory;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class CrmRepository {

    private static Logger log = Logger.getLogger(CrmRepository.class);
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

    public List<TECActualizarProductoRequestCls> productos() throws Exception {
        log.info("productos");
        try {
            SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate);

            simpleJdbcCall.withSchemaName("DOCENCIA").withCatalogName("SDOC").withProcedureName("PRODUCTOSxDIA");

            SqlParameterSource in = new MapSqlParameterSource();

            Map<String, Object> out = simpleJdbcCall.execute(in);
            log.info(out);

            List<Map<String, Object>> recordset = (ArrayList<Map<String, Object>>) out.get("S_C_RECORDSET");
            log.info("Length of retrieved batches from database = "+recordset);

            List<TECActualizarProductoRequestCls> productos = new ArrayList<>();
            com.sforce.soap2.ObjectFactory factory = new com.sforce.soap2.ObjectFactory();

            for(Map<String, Object> record : recordset) {

                TECActualizarProductoRequestCls producto = factory.createTECActualizarProductoRequestCls();
                producto.setAbreviatura(factory.createTECActualizarProductoRequestClsAbreviatura((String)record.get("ABREVIATURA")));
                producto.setCapacidad(factory.createTECActualizarProductoRequestClsCapacidad((record.get("CAPACIDAD")!=null)?((BigDecimal)record.get("CAPACIDAD")).intValue():0));
                producto.setDescripcionCurso(factory.createTECActualizarProductoRequestClsDescripcionCurso((String)record.get("DESCRIPCIONCURSO")));
                producto.setDescripcionPeriodo(factory.createTECActualizarProductoRequestClsDescripcionPeriodo((String)record.get("DESCRIPCIONPERIODO")));
                producto.setEstado(factory.createTECActualizarProductoRequestClsEstado((String)record.get("ESTADO")));
                producto.setFamilia(factory.createTECActualizarProductoRequestClsFamilia((String)record.get("FAMILIA")));
                producto.setFechaFin(factory.createTECActualizarProductoRequestClsFechaFin((String)record.get("FECHAFIN")));
                producto.setFechaInicio(factory.createTECActualizarProductoRequestClsFechaInicio((String)record.get("FECHAINICIO")));
                producto.setHoras(factory.createTECActualizarProductoRequestClsHoras(((BigDecimal)record.get("HORAS")).intValue()));
                producto.setIdTecsupArea(factory.createTECActualizarProductoRequestClsIdTecsupArea(((BigDecimal)record.get("IDTECSUPAREA")).toString()));
                producto.setIdTecsupCurso(factory.createTECActualizarProductoRequestClsIdTecsupCurso(((BigDecimal)record.get("IDTECSUPCURSO")).toString()));
                producto.setIdTecsupPeriodo(factory.createTECActualizarProductoRequestClsIdTecsupPeriodo((String)record.get("IDTECSUPPERIODO")));
                producto.setNombreCurso(factory.createTECActualizarProductoRequestClsNombreCurso((String)record.get("NOMBRECURSO")));
                producto.setNombrePeriodo(factory.createTECActualizarProductoRequestClsNombrePeriodo((String)record.get("NOMBREPERIODO")));
                producto.setSeccion(factory.createTECActualizarProductoRequestClsSeccion((String)record.get("SECCION")));
                producto.setTipo(factory.createTECActualizarProductoRequestClsTipo((String)record.get("TIPO")));
                producto.setOficina(factory.createTECActualizarProductoRequestClsOficina((String)record.get("OFICINA")));
                producto.setSede(factory.createTECActualizarProductoRequestClsSede((String)record.get("SEDE")));
                producto.setTipoOperacion(factory.createTECActualizarProductoRequestClsTipoOperacion((String)record.get("TIPOOPERACION")));
                producto.setUpdate((String)record.get("COLUM_UPDATE"));

                productos.add(producto);
            }

            log.info("productos: " + productos);

            return productos;
        }catch (Exception e){
            log.error(e, e);
            throw e;
        }
    }

    public void checkProducto(String sql) throws Exception {
        log.info("checkProducto: " + sql);
        try {
            jdbcTemplate.update(sql);
        }catch (Exception e){
            log.error(e, e);
            throw e;
        }
    }

    public List<ObjRequest> inscripciones() throws Exception {
        log.info("inscripciones");
        try {
            SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate);

            simpleJdbcCall.withSchemaName("DOCENCIA").withCatalogName("SDOC").withProcedureName("INSCRIPCIONESxDIA");

            SqlParameterSource in = new MapSqlParameterSource();

            Map<String, Object> out = simpleJdbcCall.execute(in);
            log.info(out);

            List<Map<String, Object>> recordset = (ArrayList<Map<String, Object>>) out.get("S_C_RECORDSET");
            log.info("Length of retrieved batches from database = "+recordset);

            List<ObjRequest> inscripciones = new ArrayList<>();
            ObjectFactory factory = new ObjectFactory();

            for(Map<String, Object> record : recordset) {

                ObjRequest inscripcion = factory.createObjRequest();
                inscripcion.setStrTipoOperacion(factory.createObjRequestStrTipoOperacion(((BigDecimal)record.get("TIPOPERACION")).toString()));
                inscripcion.setStrIdCursoTecsup(factory.createObjRequestStrIdCursoTecsup(((BigDecimal)record.get("IDCURSO")).toString()));
                inscripcion.setStrIdTerminoTecsup(factory.createObjRequestStrIdTerminoTecsup((String)record.get("IDTERMINO")));
                inscripcion.setStrTipoDocContacto(factory.createObjRequestStrTipoDocContacto((String)record.get("TIPDOCUMENTO")));
                inscripcion.setStrNumeroDocContacto(factory.createObjRequestStrNumeroDocContacto((String)record.get("NUMDOCUMENTO")));
                inscripcion.setStrEstado(factory.createObjRequestStrEstado((String)record.get("ESTADO")));
                inscripcion.setStrAuspiciador(factory.createObjRequestStrAuspiciador((String)record.get("AUSPICIADOR")));
                inscripcion.setStrConvenio(factory.createObjRequestStrConvenio((String)record.get("CONVENIO")));
                inscripcion.setStrMoneda(factory.createObjRequestStrMoneda((String)record.get("MONEDA")));
                inscripcion.setNumMonto(factory.createObjRequestNumMonto(Double.valueOf( ((String)record.get("MONTO")).replace(",",".") )));
                inscripcion.setStrTipoVenta(factory.createObjRequestStrTipoVenta((String)record.get("TIPOVENTA")));
                inscripcion.setUpdate((String)record.get("COLUM_UPDATE"));
                inscripciones.add(inscripcion);
            }

            log.info("inscripciones: " + inscripciones);

            return inscripciones;
        }catch (Exception e){
            log.error(e, e);
            throw e;
        }
    }

    public void saveLogs(List<String> messages) {
        log.info("saveLogs: " + messages);
        try {
            String sql = "insert into crm_logs (id, fecha, description) values (SEQCRMLOGS.nextval, sysdate, ?)";

            for (String message : messages) {
                if (message != null & message.length() > 4000) {
                    message = message.substring(0, 4000);
                }
                jdbcTemplate.update(sql, message);
            }
        }catch (Exception e){
            log.error(e, e);
        }
    }

}
