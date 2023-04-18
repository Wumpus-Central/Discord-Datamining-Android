.class public final synthetic Lg9/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lg9/a0$a;

.field public final synthetic l:I

.field public final synthetic m:I

.field public final synthetic n:I

.field public final synthetic o:F


# direct methods
.method public synthetic constructor <init>(Lg9/a0$a;IIIF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/x;->k:Lg9/a0$a;

    iput p2, p0, Lg9/x;->l:I

    iput p3, p0, Lg9/x;->m:I

    iput p4, p0, Lg9/x;->n:I

    iput p5, p0, Lg9/x;->o:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget-object v0, p0, Lg9/x;->k:Lg9/a0$a;

    iget v1, p0, Lg9/x;->l:I

    iget v2, p0, Lg9/x;->m:I

    iget v3, p0, Lg9/x;->n:I

    iget v4, p0, Lg9/x;->o:F

    invoke-static {v0, v1, v2, v3, v4}, Lg9/a0$a;->h(Lg9/a0$a;IIIF)V

    return-void
.end method
