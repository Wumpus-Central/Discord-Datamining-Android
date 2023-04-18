.class Ld2/a$q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/a;->y(Ld2/s;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ld2/s;

.field final synthetic l:Ld2/a;


# direct methods
.method constructor <init>(Ld2/a;Ld2/s;)V
    .locals 0

    iput-object p1, p0, Ld2/a$q;->l:Ld2/a;

    iput-object p2, p0, Ld2/a$q;->k:Ld2/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ld2/a$q;->l:Ld2/a;

    iget-object v1, p0, Ld2/a$q;->k:Ld2/s;

    invoke-static {v0, v1}, Ld2/a;->b0(Ld2/a;Ld2/s;)V

    return-void
.end method
