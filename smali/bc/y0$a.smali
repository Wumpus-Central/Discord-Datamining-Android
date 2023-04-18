.class Lbc/y0$a;
.super Lbc/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbc/y0;->B()Lbc/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbc/a0<",
        "TE;>;"
    }
.end annotation


# instance fields
.field final synthetic l:Lbc/y0;


# direct methods
.method constructor <init>(Lbc/y0;)V
    .locals 0

    iput-object p1, p0, Lbc/y0$a;->l:Lbc/y0;

    invoke-direct {p0}, Lbc/a0;-><init>()V

    return-void
.end method


# virtual methods
.method E()Lbc/d0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lbc/d0<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, Lbc/y0$a;->l:Lbc/y0;

    return-object v0
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget-object v0, p0, Lbc/y0$a;->l:Lbc/y0;

    invoke-virtual {v0, p1}, Lbc/y0;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method l()Z
    .locals 1

    iget-object v0, p0, Lbc/y0$a;->l:Lbc/y0;

    invoke-virtual {v0}, Lbc/d0;->l()Z

    move-result v0

    return v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lbc/y0$a;->l:Lbc/y0;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method
