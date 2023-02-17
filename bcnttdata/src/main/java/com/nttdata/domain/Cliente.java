package com.nttdata.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="CLIENTE")
public class Cliente {

	/**id de cliente*/

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_CLIENTE")
	private Long idCliente;

	/**
	 * dni del cliente
	 */
	@Column(name="DNI")
	private Integer dni;

	/**
	 * nombre del cliente
	 */
	@Column(name="NOMBRE")
	private String nombre;
	/**
	 * primer apellido del cliente
	 */
	@Column(name="APELLIDO1")
	private String apellido1;
	/**
	 * segundo apellido del cliente
	 */
	@Column(name="APELLIDO2")
	private String apellido2;


	/**
	 * telefono del cliente
	 */
	@Column(name="TELEFONO")
	private Integer telefono;
	/**
	 * correo del cliente
	 */
	@Column(name="CORREO")
	private String correo;
	/**
	 * fecha de nacimiento del cliente
	 */
	@Column(name="FC_NACIMIENTO")
	private LocalDate fcNacimiento;

	//******************************
	//**** CLIENTE PERSONA JURÍDICA*
	//******************************
	/**
	 * razon social
	 */
	@Column(name="RAZON_SOCIAL")
	private String razonSocial;

	/**
	 *  ruc de persona jurídica
	 */
	@Column(name="RUC")
	private String ruc;
	/**
	 * direccion de persona jurídica
	 */
	private String direccion;
	@ManyToOne
	@JoinColumn(name ="ID_TIPO_CLIENTE")
	private CatalogosValores tipoCliente;


	/**
	 * fecha de alta de registro
	 */
	@Column(name="FC_ALTA_FILA")
	private LocalDateTime fcAltaFila;
	/**
	 * fecha de modificacion
	 */
	@Column(name="FC_MODIF_FILA")
	private LocalDateTime fcModifFila;
	/**
	 * fecha de baja
	 */
	@Column(name="FC_BAJA_FILA")
	private LocalDateTime fcBajaFila;

	public Cliente() {

	}


	/**
	 * @return the idCliente
	 */
	public Long getIdCliente() {
		return this.idCliente;
	}
	/**
	 * @param idCliente the idCliente to set
	 */
	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	/**
	 * @return the dni
	 */
	public Integer getDni() {
		return this.dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return this.nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellido1
	 */
	public String getApellido1() {
		return this.apellido1;
	}
	/**
	 * @param apellido1 the apellido1 to set
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	/**
	 * @return the apellido2
	 */
	public String getApellido2() {
		return this.apellido2;
	}
	/**
	 * @param apellido2 the apellido2 to set
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	/**
	 * @return the telefono
	 */
	public Integer getTelefono() {
		return this.telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return this.correo;
	}
	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/**
	 * @return the fcNacimiento
	 */
	public LocalDate getFcNacimiento() {
		return this.fcNacimiento;
	}
	/**
	 * @param fcNacimiento the fcNacimiento to set
	 */
	public void setFcNacimiento(LocalDate fcNacimiento) {
		this.fcNacimiento = fcNacimiento;
	}
	/**
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return this.razonSocial;
	}
	/**
	 * @param razonSocial the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return this.direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the tipoCliente
	 */
	public CatalogosValores getTipoCliente() {
		return this.tipoCliente;
	}
	/**
	 * @param tipoCliente the tipoCliente to set
	 */
	public void setTipoCliente(CatalogosValores tipoCliente) {
		this.tipoCliente = tipoCliente;
	}


	/**
	 * @return the fcAltaFila
	 */
	public LocalDateTime getFcAltaFila() {
		return this.fcAltaFila;
	}


	/**
	 * @param fcAltaFila the fcAltaFila to set
	 */
	public void setFcAltaFila(LocalDateTime fcAltaFila) {
		this.fcAltaFila = fcAltaFila;
	}


	/**
	 * @return the fcModifFila
	 */
	public LocalDateTime getFcModifFila() {
		return this.fcModifFila;
	}


	/**
	 * @param fcModifFila the fcModifFila to set
	 */
	public void setFcModifFila(LocalDateTime fcModifFila) {
		this.fcModifFila = fcModifFila;
	}


	/**
	 * @return the fcBajaFila
	 */
	public LocalDateTime getFcBajaFila() {
		return this.fcBajaFila;
	}


	/**
	 * @param fcBajaFila the fcBajaFila to set
	 */
	public void setFcBajaFila(LocalDateTime fcBajaFila) {
		this.fcBajaFila = fcBajaFila;
	}



	@Override
	public String toString() {
		return "Cliente [idCliente=" + this.idCliente + ", dni=" + this.dni + ", nombre=" + this.nombre + ", apellido1=" + this.apellido1
				+ ", apellido2=" + this.apellido2 + ", telefono=" + this.telefono + ", correo=" + this.correo + ", fcNacimiento="
				+ this.fcNacimiento + ", razonSocial=" + this.razonSocial + ", ruc=" + this.ruc + ", direccion=" + this.direccion
				+ ", tipoCliente=" + this.tipoCliente + ", fcAltaFila=" + this.fcAltaFila + ", fcModifFila=" + this.fcModifFila
				+ ", fcBajaFila=" + this.fcBajaFila + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.idCliente == null) ? 0 : this.idCliente.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		Cliente other = (Cliente) obj;
		if (this.idCliente == null) {
			if (other.idCliente != null) {
				return false;
			}
		} else if (!this.idCliente.equals(other.idCliente)) {
			return false;
		}
		return true;
	}


	/**
	 * @return the ruc
	 */
	public String getRuc() {
		return this.ruc;
	}


	/**
	 * @param ruc the ruc to set
	 */
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

}
