package farmaciaagora.alphalumos.com.appusuariofarmaciaagora.Class;

import java.util.Calendar;

/**
 * Created by rafael on 27/02/18.
 */

public class Pedido
{
    private String idPedido;
    private Calendar hora;
    private String loca;
    private String status;

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public Calendar getHora() {
        return hora;
    }

    public void setHora(Calendar hora) {
        this.hora = hora;
    }

    public String getLoca() {
        return loca;
    }

    public void setLoca(String loca) {
        this.loca = loca;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
