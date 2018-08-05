package com.leeg.callcenteralmundo.logica;

import java.util.concurrent.ThreadLocalRandom;

public final class LogicaGeneral {

    public static Integer generarAleatorio(Integer min, Integer max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
    
    
}
