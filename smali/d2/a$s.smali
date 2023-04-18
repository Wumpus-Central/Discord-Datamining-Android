.class Ld2/a$s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/a;->C(Ljava/lang/String;Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Ljava/lang/String;

.field final synthetic l:Lorg/json/JSONObject;

.field final synthetic m:Ld2/a;


# direct methods
.method constructor <init>(Ld2/a;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 0

    iput-object p1, p0, Ld2/a$s;->m:Ld2/a;

    iput-object p2, p0, Ld2/a$s;->k:Ljava/lang/String;

    iput-object p3, p0, Ld2/a$s;->l:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Ld2/a$s;->m:Ld2/a;

    iget-object v1, p0, Ld2/a$s;->k:Ljava/lang/String;

    iget-object v2, p0, Ld2/a$s;->l:Lorg/json/JSONObject;

    invoke-static {v0, v1, v2}, Ld2/a;->d0(Ld2/a;Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method
