.class public interface abstract Lcom/facebook/react/modules/network/NetworkingModule$ResponseHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/modules/network/NetworkingModule;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "ResponseHandler"
.end annotation


# virtual methods
.method public abstract supports(Ljava/lang/String;)Z
.end method

.method public abstract toResponseData(Lokhttp3/ResponseBody;)Lcom/facebook/react/bridge/WritableMap;
.end method
