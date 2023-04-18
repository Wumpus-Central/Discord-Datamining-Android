.class public final synthetic Lic/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lic/b0;

.field public final synthetic l:Lsc/b;


# direct methods
.method public synthetic constructor <init>(Lic/b0;Lsc/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lic/l;->k:Lic/b0;

    iput-object p2, p0, Lic/l;->l:Lsc/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lic/l;->k:Lic/b0;

    iget-object v1, p0, Lic/l;->l:Lsc/b;

    invoke-static {v0, v1}, Lic/n;->g(Lic/b0;Lsc/b;)V

    return-void
.end method
