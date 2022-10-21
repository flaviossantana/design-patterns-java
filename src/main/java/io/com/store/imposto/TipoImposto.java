package io.com.store.imposto;

import java.math.BigDecimal;

public enum TipoImposto {

    ICMS{
        BigDecimal percentual() {
            return BigDecimal.valueOf(0.1);
        }
    },
    ISS {
        BigDecimal percentual() {
            return BigDecimal.valueOf(0.06);
        }
    },
    IPI {
        BigDecimal percentual() {
            return BigDecimal.valueOf(0.03);
        }
    };

    abstract BigDecimal percentual();

}
