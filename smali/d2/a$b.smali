.class Ld2/a$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/a;->c1(Ld2/y;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ld2/y;

.field final synthetic l:Ld2/a;


# direct methods
.method constructor <init>(Ld2/a;Ld2/y;)V
    .locals 0

    iput-object p1, p0, Ld2/a$b;->l:Ld2/a;

    iput-object p2, p0, Ld2/a$b;->k:Ld2/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Ld2/a$b;->l:Ld2/a;

    iget-object v1, p0, Ld2/a$b;->k:Ld2/y;

    invoke-static {v0, v1}, Ld2/a;->S(Ld2/a;Ld2/y;)V

    return-void
.end method
