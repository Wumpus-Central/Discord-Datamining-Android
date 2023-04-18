.class public final synthetic Lg9/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lg9/a0$a;

.field public final synthetic l:I

.field public final synthetic m:J


# direct methods
.method public synthetic constructor <init>(Lg9/a0$a;IJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg9/w;->k:Lg9/a0$a;

    iput p2, p0, Lg9/w;->l:I

    iput-wide p3, p0, Lg9/w;->m:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lg9/w;->k:Lg9/a0$a;

    iget v1, p0, Lg9/w;->l:I

    iget-wide v2, p0, Lg9/w;->m:J

    invoke-static {v0, v1, v2, v3}, Lg9/a0$a;->e(Lg9/a0$a;IJ)V

    return-void
.end method
