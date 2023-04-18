.class public Lxa/g$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxa/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Lxa/i;

.field private b:Lxa/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lxa/i;->s:Lxa/i;

    iput-object v0, p0, Lxa/g$a;->a:Lxa/i;

    return-void
.end method


# virtual methods
.method public a()Lxa/g;
    .locals 4

    new-instance v0, Lxa/g;

    iget-object v1, p0, Lxa/g$a;->a:Lxa/i;

    iget-object v2, p0, Lxa/g$a;->b:Lxa/f;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lxa/g;-><init>(Lxa/i;Lxa/f;Lxa/m;)V

    return-object v0
.end method
