package com.procedure.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.procedure.entity.Contact;
import com.procedure.entity.Cuadratura;
import com.procedure.entity.Procedure;





@Mapper
public interface ConsultaSelect2 {
	
	@Select("SELECT tx.id_empresa, tx.idRendicion, tx.fecha, tx.id_local, tx.id_usuario, tx.estado " 
			+ "FROM (SELECT " 
			+ " lo.id_empresa,cu.id AS idRendicion,cu.fecha_contable AS fecha,cu.id_local,cu.id_usuario,cu.estado AS estado,SUM(monto_recaudado) MONTO_RENDIDO,"
			+ " COALESCE((SELECT sum(trx_monto) FROM cl_trx "
			+ " where 1 = 1" 
			+ " and id_empresa = lo.id_empresa and id_local = cu.id_local and trx_fechacon = cu.fecha_contable and etx_estado = 'APR' "
			+ " and  ecn_estado != 'NCO' and ecn_estado  != 'ANU' and trx_origen not in ('LIQ', 'CON')  ),0) as MONTO_VENDIDO,"
			+ " COALESCE((SELECT SUM(monto_recaudado) FROM cdt_detalle_cuadratura"
			+ " WHERE 1 = 1"
			+ " AND id_cuadratura = (SELECT MAX(id) FROM cdt_cuadratura" 
			+ " WHERE id_local = lo.id_local AND fecha_contable = cu.fecha_contable LIMIT 1)"
			+ " AND id_fpm IN (SELECT id_fpm FROM cl_formapago_moneda "
			+ " WHERE id_moneda = fpm.id_moneda AND id_pais = pa.id_pais AND depositable = 'S')), 0) AS MONTO_DEPOSITABLE,"
			+ " COALESCE((SELECT SUM(dpt_monto) FROM cdt_deposito"
			+ " WHERE 1 = 1 AND id_cuadratura = (SELECT  MAX(id) FROM cdt_cuadratura" 
			+ " WHERE id_local = lo.id_local AND fecha_contable = cu.fecha_contable LIMIT 1)"
			+ " AND id_fpm IN (SELECT id_fpm FROM cl_formapago_moneda "
			+ " WHERE id_moneda = fpm.id_moneda AND id_pais = pa.id_pais AND depositable = 'S')), 0) AS MONTO_DEPOSITADO"
			+ " FROM cdt_cuadratura cu, cl_local lo, cl_usuario us, cdt_detalle_cuadratura de, cl_formapago_moneda fpm," 
			+ " cl_pais pa, cl_sistema sis WHERE 1 = 1"
			+ " AND cu.id_local = lo.id_local AND cu.estado IN (2, 3, 4) AND lo.id_empresa IN ( 1, 2 )" 
			+ " AND lo.cierre_automatico = 'S' AND MONTH( cu.fecha_contable ) = MONTH( current_date() ) "
			+ " AND YEAR( cu.fecha_contable ) = YEAR( current_date() ) AND pa.id_pais = lo.id_pais"
			+ " AND sis.id_sistema = lo.id_sistema AND cu.id_usuario = us.id_usuario AND de.id_fpm = fpm.id_fpm" 
			+ " AND cu.id = de.id_cuadratura GROUP BY cu.id ) AS tx" 
			+ " WHERE 1 = 1 AND tx.monto_vendido = tx.monto_rendido AND ( tx.monto_depositado - tx.monto_depositable ) >= 0;")
	@Results({
		@Result(property = "idEmpresa", column = "id_empresa"),
		@Result(property = "idRendicion", column = "idRendicion"),
		@Result(property = "fecha", column = "fecha"),
		@Result(property = "idLocal", column = "id_local"),
		@Result(property = "idUsuario", column = "id_usuario"),
		@Result(property = "estado", column = "estado")
	})
	public List<com.procedure.entity.Procedure> proce();
	

	//@Update("UPDATE cdt_cuadratura SET estado = 5 WHERE id = #{v_IDRENDICION} AND id_local = #{v_ID_LOCAL} AND fecha_contable = #{v_FECHA_CON}; ")
	//public void updateCuadratura( @Param("v_IDRENDICION") String idrendicion,@Param("v_ID_LOCAL") String local,@Param("v_FECHA_CON") String fecha);
	
	@Update({" <script> "
			+ "<foreach collection='listado' item='cont' index='index'  >"
			+ "UPDATE cdt_cuadratura SET estado = 5 "
			+ "WHERE id = #{cont.idRendicion} AND id_local = #{cont.idLocal} AND fecha_contable = #{cont.fecha}; "
			+ " </foreach>  "
			+ " </script> "})
	public void updateCuadratura(@Param("listado") List<Procedure> listado);
	
	
	
	@Insert({" <script> "
			+ " INSERT INTO cdt_estado_cuadratura (`id_cuadratura`,`id_usuario`,`estado`) "
			+ " VALUES "
			+ "<foreach collection='listado' item='cont' index='index' separator=',' close=';' > "
			+ "( #{cont.idRendicion}, #{cont.idUsuario}, #{cont.estado}) "
			+ " </foreach>  "
			+ " </script> "})
	public void insertCuadratura2(@Param("listado") List<Procedure> listado);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Select("select * from contacto ")
//	@Results({
//		@Result(property = "idContac", column = "id"),
//		@Result(property = "apellidoContact", column = "apellido"),
//		@Result(property = "ciudadContact", column = "ciudad"),
//		@Result(property = "nombreContact", column = "nombre"),
//		@Result(property = "telefonoContact", column = "telefono")
//	})
//	public List<Contact> getContac();
//	
//	
//	@Update("UPDATE contacto SET ciudad = 'Iquique' WHERE ciudad = #{ciudad}; ")
//	public void updatecontac( @Param("ciudad") String appe);
//
//	
//	@Insert({" <script> "
//			+ " INSERT INTO usuario( nombreusu, claveusu, enabled) "
//			+ " VALUES "
//			+ "<foreach collection='listado' item='cont' index='index' separator=',' close=';' > "
//			+ "( #{cont.nombreContact}, #{cont.ciudadContact}, 1) "
//			+ " </foreach>  "
//			+ " </script> "})
//	public void insertUsu(@Param("listado") List<Contact> listado);
	
}
