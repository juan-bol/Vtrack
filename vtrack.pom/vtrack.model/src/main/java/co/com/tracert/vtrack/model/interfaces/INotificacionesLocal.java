package co.com.tracert.vtrack.model.interfaces;

import co.com.tracert.vtrack.model.entities.Cuenta;

public interface INotificacionesLocal {
	
	public void enviarCorreo(Cuenta cuenta, String asunto, String cuerpo) throws Exception;

}
