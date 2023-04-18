.class Ld2/m$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld2/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/m;->b(Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Ljava/lang/String;

.field final synthetic c:Ld2/m;


# direct methods
.method constructor <init>(Ld2/m;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Ld2/m$f;->c:Ld2/m;

    iput-object p2, p0, Ld2/m$f;->a:Ljava/lang/String;

    iput-object p3, p0, Ld2/m$f;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ld2/a;)V
    .locals 2

    iget-object v0, p0, Ld2/m$f;->a:Ljava/lang/String;

    iget-object v1, p0, Ld2/m$f;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Ld2/a;->u0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
