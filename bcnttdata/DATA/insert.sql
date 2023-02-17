INSERT INTO public.catalogos(
	 ds_nombre, it_mantenible, tl_descripcion)
	VALUES ('tipo persona', 'N', 'identifica el tipo de persona si es jurídica o natural');
	

INSERT INTO public.catalogos(
	 ds_nombre, it_mantenible, tl_descripcion)
	VALUES ('tipo de tarjeta', 'N', 'identifica el tipo de tarjeta es débito o crédito');
	
	
INSERT INTO public.catalogos(
	 ds_nombre, it_mantenible, tl_descripcion)
	VALUES ('tipo de operaciones', 'N', 'identifica el tipo de tarjeta es débito o crédito');	
	
	--truncate catalogos where idcatalogo = 3
	
	
	--- catalogos valores
	
	INSERT INTO public.catalogos_valores(
	 cd_codigo, ds_valor, it_mantenible, id_catalogo)
	VALUES ('PJ', 'Persona jurídica', 'N', 1 );
	
	INSERT INTO public.catalogos_valores(
	cd_codigo, ds_valor, it_mantenible, id_catalogo)
	VALUES ('PN', 'Persona natural', 'N', 1 );
	
	INSERT INTO public.catalogos_valores(
	cd_codigo, ds_valor, it_mantenible, id_catalogo)
	VALUES ('TD', 'Tarjeta débito', 'N', 2 );
	
	INSERT INTO public.catalogos_valores(
	cd_codigo, ds_valor, it_mantenible, id_catalogo)
	VALUES ('TC', 'Tarjeta crédito', 'N', 2 );
	
	
	INSERT INTO public.catalogos_valores(
	cd_codigo, ds_valor, it_mantenible, id_catalogo)
	VALUES ('DP', 'Depósito', 'N', 3 );
	
	
	INSERT INTO public.catalogos_valores(
	 cd_codigo, ds_valor, it_mantenible, id_catalogo)
	VALUES ('RT', 'Retiro', 'N', 3 );
	
	
	INSERT INTO public.catalogos_valores(
	 cd_codigo, ds_valor, it_mantenible, id_catalogo)
	VALUES ('TB', 'Transferencias bancarias', 'N', 3 );
	
	
	INSERT INTO public.catalogos_valores(
	cd_codigo, ds_valor, it_mantenible, id_catalogo)
	VALUES ('PC', 'Pagos créditos', 'N', 3 );
	
	
	INSERT INTO public.catalogos_valores(
	cd_codigo, ds_valor, it_mantenible, id_catalogo)
	VALUES ('PTC', 'Pagos de tarjeta de crédito', 'N', 3 );
	
--------------------- CLIENTE PERSONA JURÍDICA
INSERT INTO public.cliente(
	  razon_social, ruc, direccion, id_tipo_cliente)
	VALUES ('Banco pichincha', '1045977988', 'Lima San Borja', 1);
	
INSERT INTO public.cliente(
	  razon_social, ruc, direccion, id_tipo_cliente)
	VALUES ('Banco SCOTIABANK', '10459779081', 'Lima San Borja', 1);

--- CLIENTE PERSONA NATURAL

INSERT INTO public.cliente(
	 apellido1, apellido2, correo, direccion, dni,  nombre, telefono, id_tipo_cliente)
	VALUES ('Martínez', 'Ascues', 'martinez@gmail.com','Lima - sjl', 45977988, 'Grek', 931450988, 2);

INSERT INTO public.cliente(
	 apellido1, apellido2, correo, direccion, dni,  nombre, telefono, id_tipo_cliente)
	VALUES ('López', 'Saavedra', 'saavedra1@gmail.com','Lima - San Borja', 45977933, 'Ricardo', 931450155, 2);

INSERT INTO public.cliente(
	 apellido1, apellido2, correo, direccion, dni,  nombre, telefono, id_tipo_cliente)
	VALUES ('Valencia', 'Hurtado', 'valencia1@gmail.com','Lima - La Victoria', 45977574, 'Rosa María', 931450174, 2);


--- TARJETA debito
INSERT INTO public.tarjeta(
	 cd_pin, cd_validacion, fc_corte, fc_vencimiento, fc_vencimiento_mensual, limite_credito, nm_tarjeta, saldo_actual, id_tipo_tarjeta)
	VALUES (4561, 458, '2024/12/31', '2026/12/31', '2024/12/10', 7000, '455897441252', 5000, 3);


INSERT INTO public.tarjeta(
	 cd_pin, cd_validacion, fc_corte, fc_vencimiento, fc_vencimiento_mensual, limite_credito, nm_tarjeta, saldo_actual, id_tipo_tarjeta)
	VALUES (4571, 418, '2024/12/31', '2026/12/31', '2024/12/10', 8000, '455897441878', 3000, 3);



INSERT INTO public.tarjeta(
	 cd_pin, cd_validacion, fc_corte, fc_vencimiento, fc_vencimiento_mensual, limite_credito, nm_tarjeta, saldo_actual, id_tipo_tarjeta)
	VALUES (4271, 428, '2024/12/31', '2026/12/31', '2024/12/10', 8000, '45589744155', 3000, 4);


INSERT INTO public.tarjeta(
	 cd_pin, cd_validacion, fc_corte, fc_vencimiento, fc_vencimiento_mensual, limite_credito, nm_tarjeta, saldo_actual, id_tipo_tarjeta)
	VALUES (4571, 458, '2024/12/31', '2026/12/31', '2024/12/10', 8000, '455897441212', 4000, 4);
	
	
	--- pago crédito
	
	INSERT INTO public.pago_credito(
	 fc_inicio, fc_pago_mensual, nm_cuotas, saldo_actual, saldo_inicial)
	VALUES ('2023/02/13', '2023/02/20', 10, 5500, 10000);
	
	INSERT INTO public.pago_credito(
	 fc_inicio, fc_pago_mensual, nm_cuotas, saldo_actual, saldo_inicial)
	VALUES ('2023/02/12', '2023/02/10', 20, 5000, 11000);

---- CUENTA BANCARIA
	INSERT INTO public.cuenta_bancaria(
	 fc_alta_fila, nm_cuenta, tj_asoc_principal, tj_asoc_secundaria, id_operacion, id_pago_credito)
	VALUES ('2023/02/13', 14558878, 'S', 'N', 8, 1);
	
	INSERT INTO public.cuenta_bancaria(
	 fc_alta_fila, nm_cuenta, tj_asoc_principal, tj_asoc_secundaria, id_operacion, id_pago_credito)
	VALUES ('2023/02/13', 14558432, 'N', 'S', 6, 2);


select * from pago_credito;
select * from tarjeta;
select * from cliente;
select * from catalogos;

select * from cuenta_bancaria;


select * from catalogos_valores;

select * from cliente
