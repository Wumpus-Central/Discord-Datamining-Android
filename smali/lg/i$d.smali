.class public final Llg/i$d;
.super Lpg/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llg/i;->l(Lci/n;)Ldi/g0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# direct methods
.method constructor <init>(Lmg/h0;Llh/c;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lpg/z;-><init>(Lmg/h0;Llh/c;)V

    return-void
.end method


# virtual methods
.method public F0()Lwh/h$b;
    .locals 1

    sget-object v0, Lwh/h$b;->b:Lwh/h$b;

    return-object v0
.end method

.method public bridge synthetic p()Lwh/h;
    .locals 1

    invoke-virtual {p0}, Llg/i$d;->F0()Lwh/h$b;

    move-result-object v0

    return-object v0
.end method
