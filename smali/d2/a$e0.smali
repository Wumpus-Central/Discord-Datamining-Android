.class Ld2/a$e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld2/i0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/a;->V0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ld2/a;


# direct methods
.method constructor <init>(Ld2/a;)V
    .locals 0

    iput-object p1, p0, Ld2/a$e0;->a:Ld2/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ld2/x0;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Ld2/a$e0;->a:Ld2/a;

    invoke-virtual {v0, p1, p2}, Ld2/a;->z1(Ld2/x0;Ljava/lang/String;)V

    return-void
.end method
