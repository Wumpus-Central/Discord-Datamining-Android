.class public Ls2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lg2/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls2/e;

    invoke-direct {v0}, Ls2/e;-><init>()V

    sput-object v0, Ls2/f;->a:Lg2/h0;

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ls2/f;->a:Lg2/h0;

    invoke-interface {v0, p0}, Lg2/h0;->b(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Ls2/f;->a:Lg2/h0;

    invoke-interface {v0, p0, p1}, Lg2/h0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static c(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Ls2/f;->a:Lg2/h0;

    invoke-interface {v0, p0}, Lg2/h0;->d(Ljava/lang/String;)V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Ls2/f;->a:Lg2/h0;

    invoke-interface {v0, p0, p1}, Lg2/h0;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
