.class public interface abstract Lcom/facebook/react/modules/network/CookieJarContainer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/CookieJar;


# virtual methods
.method public abstract synthetic loadForRequest(Lokhttp3/HttpUrl;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/HttpUrl;",
            ")",
            "Ljava/util/List<",
            "Loj/k;",
            ">;"
        }
    .end annotation
.end method

.method public abstract removeCookieJar()V
.end method

.method public abstract synthetic saveFromResponse(Lokhttp3/HttpUrl;Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/HttpUrl;",
            "Ljava/util/List<",
            "Loj/k;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract setCookieJar(Lokhttp3/CookieJar;)V
.end method
