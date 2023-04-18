.class Lbc/i0$a;
.super Lbc/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbc/i0;->w(I)Lbc/h2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbc/a<",
        "TE;>;"
    }
.end annotation


# instance fields
.field final synthetic m:Lbc/i0;


# direct methods
.method constructor <init>(Lbc/i0;II)V
    .locals 0

    iput-object p1, p0, Lbc/i0$a;->m:Lbc/i0;

    invoke-direct {p0, p2, p3}, Lbc/a;-><init>(II)V

    return-void
.end method


# virtual methods
.method protected a(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget-object v0, p0, Lbc/i0$a;->m:Lbc/i0;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
