package one.digitalInovation.gof.subsistema2.cep;

import one.digitalInovation.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();
    private CepApi(){
        super();
    }
    public static CepApi getInstancia(){
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "São José dos Campos";
    }
    public String recuperarEstado(String cep){
        return "SP";
    }
}
