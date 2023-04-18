.class Ld2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/a;->z1(Ld2/x0;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ld2/x0;

.field final synthetic l:Ljava/lang/String;

.field final synthetic m:Ld2/a;


# direct methods
.method constructor <init>(Ld2/a;Ld2/x0;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ld2/a$a;->m:Ld2/a;

    iput-object p2, p0, Ld2/a$a;->k:Ld2/x0;

    iput-object p3, p0, Ld2/a$a;->l:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Ld2/a$a;->m:Ld2/a;

    iget-object v1, p0, Ld2/a$a;->k:Ld2/x0;

    iget-object v2, p0, Ld2/a$a;->l:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld2/a;->R(Ld2/a;Ld2/x0;Ljava/lang/String;)V

    return-void
.end method
