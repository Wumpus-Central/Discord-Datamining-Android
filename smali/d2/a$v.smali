.class Ld2/a$v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/a;->z(Ld2/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ld2/n;

.field final synthetic l:Ld2/a;


# direct methods
.method constructor <init>(Ld2/a;Ld2/n;)V
    .locals 0

    iput-object p1, p0, Ld2/a$v;->l:Ld2/a;

    iput-object p2, p0, Ld2/a$v;->k:Ld2/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ld2/a$v;->l:Ld2/a;

    iget-object v1, p0, Ld2/a$v;->k:Ld2/n;

    invoke-static {v0, v1}, Ld2/a;->g0(Ld2/a;Ld2/n;)V

    return-void
.end method
