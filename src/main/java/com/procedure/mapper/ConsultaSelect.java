package com.procedure.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.procedure.entity.Cuadratura;



@Mapper
public interface ConsultaSelect {
	
//	@Select("SELECT tx.id_empresa, tx.idRendicion, tx.fecha, tx.id_local, tx.id_usuario, tx.estado \r\n"
//			+ "			  FROM (\r\n"
//			+ "			SELECT \r\n"
//			+ "				lo.id_empresa,\r\n"
//			+ "				cu.id AS idRendicion,\r\n"
//			+ "				cu.fecha_contable AS fecha,\r\n"
//			+ "				cu.id_local,\r\n"
//			+ "				cu.id_usuario,\r\n"
//			+ "				cu.estado AS estado,\r\n"
//			+ "				SUM(monto_recaudado) MONTO_RENDIDO,\r\n"
//			+ "				COALESCE((SELECT sum(trx_monto) \r\n"
//			+ "						FROM cl_trx \r\n"
//			+ "						where 1 = 1\r\n"
//			+ "						and id_empresa = lo.id_empresa\r\n"
//			+ "						and id_local = cu.id_local \r\n"
//			+ "						and trx_fechacon = cu.fecha_contable  \r\n"
//			+ "						and id_forma_pago = fpm.id_forma_pago  \r\n"
//			+ "						and id_moneda = fpm.id_moneda \r\n"
//			+ "						and etx_estado = 'APR' and  ecn_estado != 'NCO' and ecn_estado  != 'ANU'  ),0) as MONTO_VENDIDO, \r\n"
//			+ "				\r\n"
//			+ "				 COALESCE((SELECT \r\n"
//			+ "								SUM(monto_recaudado)\r\n"
//			+ "							FROM\r\n"
//			+ "								cdt_detalle_cuadratura\r\n"
//			+ "							WHERE\r\n"
//			+ "								1 = 1\r\n"
//			+ "									AND id_cuadratura = (SELECT \r\n"
//			+ "										MAX(id)\r\n"
//			+ "									FROM\r\n"
//			+ "										cdt_cuadratura\r\n"
//			+ "									WHERE\r\n"
//			+ "										id_local = lo.id_local\r\n"
//			+ "											AND fecha_contable = cu.fecha_contable\r\n"
//			+ "									LIMIT 1)\r\n"
//			+ "									AND id_fpm IN (SELECT \r\n"
//			+ "										id_fpm\r\n"
//			+ "									FROM\r\n"
//			+ "										cl_formapago_moneda\r\n"
//			+ "									WHERE\r\n"
//			+ "										id_moneda = fpm.id_moneda\r\n"
//			+ "											AND id_pais = pa.id_pais\r\n"
//			+ "											AND depositable = 'S')), 0) AS MONTO_DEPOSITABLE,\r\n"
//			+ "						COALESCE((SELECT \r\n"
//			+ "								SUM(dpt_monto)\r\n"
//			+ "							FROM\r\n"
//			+ "								cdt_deposito\r\n"
//			+ "							WHERE\r\n"
//			+ "								1 = 1\r\n"
//			+ "									AND id_cuadratura = (SELECT \r\n"
//			+ "										MAX(id)\r\n"
//			+ "									FROM\r\n"
//			+ "										cdt_cuadratura\r\n"
//			+ "									WHERE\r\n"
//			+ "										id_local = lo.id_local\r\n"
//			+ "											AND fecha_contable = cu.fecha_contable\r\n"
//			+ "									LIMIT 1)\r\n"
//			+ "									AND id_fpm IN (SELECT \r\n"
//			+ "										id_fpm\r\n"
//			+ "									FROM\r\n"
//			+ "										cl_formapago_moneda\r\n"
//			+ "									WHERE\r\n"
//			+ "										id_moneda = fpm.id_moneda\r\n"
//			+ "											AND id_pais = pa.id_pais\r\n"
//			+ "											AND depositable = 'S')), 0) AS MONTO_DEPOSITADO\r\n"
//			+ "			FROM\r\n"
//			+ "				cdt_cuadratura cu,\r\n"
//			+ "				cl_local lo,\r\n"
//			+ "				cl_usuario us,\r\n"
//			+ "				cdt_detalle_cuadratura de,\r\n"
//			+ "				cl_formapago_moneda fpm,\r\n"
//			+ "				cl_pais pa,\r\n"
//			+ "				cl_sistema sis\r\n"
//			+ "			WHERE 1 = 1\r\n"
//			+ "				AND cu.id_local = lo.id_local\r\n"
//			+ "				AND cu.estado IN (2, 3, 4)\r\n"
//			+ "                AND lo.id_empresa LIKE IFNULL(#{par_empresa}, '%')\r\n"
//			+ "                AND lo.cierre_automatico = 'S'\r\n"
//			+ "					-- AND ( DATE( cu.created ) =  OR DATE( cu.updated ) = current_date() )\r\n"
//			+ "					AND cu.fecha_contable BETWEEN IFNULL(#{par_finicio}, current_date()) AND IFNULL(#{par_ffin}, current_date())\r\n"
//			+ "					AND pa.id_pais = lo.id_pais\r\n"
//			+ "					AND sis.id_sistema = lo.id_sistema\r\n"
//			+ "					AND cu.id_usuario = us.id_usuario\r\n"
//			+ "					AND de.id_fpm = fpm.id_fpm\r\n"
//			+ "					AND cu.id = de.id_cuadratura\r\n"
//			+ "			GROUP BY cu.id ) AS tx\r\n"
//			+ "			WHERE 1 = 1\r\n"
//			+ "			  AND tx.monto_vendido = tx.monto_rendido\r\n"
//			+ "			  AND ( tx.monto_depositado - tx.monto_depositable ) >= 0;")
//	public String proce(@Param("par_empresa") int token,@Param("par_finicio") String fecha_inicio,@Param("par_ffin") String fecha_fin);
	@Select("select fecha_contable,id from cdt_cuadratura where id_local = #{idlocal}")
	@Results({
		@Result(property = "fechaContable", column = "fecha_contable")
	})
	public List<Cuadratura> getEmpresa(@Param("idlocal") String idlocal);

}
