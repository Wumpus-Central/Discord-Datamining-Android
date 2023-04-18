.class Ld2/a$z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld2/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/a;->V0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ld2/a;


# direct methods
.method constructor <init>(Ld2/a;)V
    .locals 0

    iput-object p1, p0, Ld2/a$z;->a:Ld2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ld2/a;)V
    .locals 1

    iget-object v0, p0, Ld2/a$z;->a:Ld2/a;

    invoke-static {v0}, Ld2/a;->k0(Ld2/a;)Ld2/h;

    move-result-object v0

    iget-object v0, v0, Ld2/h;->y:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-static {p1, v0}, Ld2/a;->M(Ld2/a;Z)V

    return-void
.end method
