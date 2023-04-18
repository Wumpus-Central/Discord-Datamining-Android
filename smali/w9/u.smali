.class public Lw9/u;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/content/Context;)Lw9/v;
    .locals 1

    sget-object v0, Lw9/w;->l:Lw9/w;

    invoke-static {p0, v0}, Lw9/u;->b(Landroid/content/Context;Lw9/w;)Lw9/v;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Lw9/w;)Lw9/v;
    .locals 1

    new-instance v0, Ly9/d;

    invoke-direct {v0, p0, p1}, Ly9/d;-><init>(Landroid/content/Context;Lw9/w;)V

    return-object v0
.end method
