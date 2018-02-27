package farmaciaagora.alphalumos.com.appusuariofarmaciaagora.Class;

import java.util.Date;

/**
 * Created by rafael on 27/02/18.
 */

public class Farmacia
{
    private String idFarmacia;
    private String enderecoFarmacia;
    private Date horaFuncionamento;
    private String telefone;

    public String getIdFarmacia()
    {
        return idFarmacia;
    }

    public void setIdFarmacia(String idFarmacia)
    {
        this.idFarmacia = idFarmacia;
    }

    public String getEndereco()
    {
        return enderecoFarmacia;
    }

    public void setEndereco(String endereco)
    {
        this.enderecoFarmacia = endereco;
    }

    public Date getHoraFuncionamento()
    {
        return horaFuncionamento;
    }

    public void setHoraFuncionamento(Date horaFuncionamento)
    {
        this.horaFuncionamento = horaFuncionamento;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }
}
