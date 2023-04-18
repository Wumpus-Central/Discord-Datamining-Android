.class public interface abstract Lcom/facebook/react/packagerconnection/ReconnectingWebSocket$MessageCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/packagerconnection/ReconnectingWebSocket;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "MessageCallback"
.end annotation


# virtual methods
.method public abstract onMessage(Ljava/lang/String;)V
.end method

.method public abstract onMessage(Lokio/ByteString;)V
.end method
