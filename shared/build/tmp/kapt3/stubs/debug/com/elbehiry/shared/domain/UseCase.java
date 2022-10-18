package com.elbehiry.shared.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\t"}, d2 = {"Lcom/elbehiry/shared/domain/UseCase;", "P", "R", "", "()V", "execute", "parameters", "(Ljava/lang/Object;)Ljava/lang/Object;", "invoke", "shared_debug"})
public abstract class UseCase<P extends java.lang.Object, R extends java.lang.Object> {
    
    public UseCase() {
        super();
    }
    
    public final R invoke(P parameters) {
        return null;
    }
    
    protected abstract R execute(P parameters);
}