package farmaciaagora.alphalumos.com.appusuariofarmaciaagora.Class;

/**
 * Created by rafael on 22/02/18.
 */

public class Usuario
{
    private String userId;
    private String nomeUsuario;
    private String email;

    public String getUserId()
    {
        return userId;
    }

    public void setUserId(String userId)
    {
        this.userId = userId;
    }

    public String getNome()
    {
        return nomeUsuario;
    }

    public void setNome(String nomeUsuario)
    {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
