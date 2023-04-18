.class public final synthetic Lh8/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lh8/j0;

.field public final synthetic l:Ll7/y;


# direct methods
.method public synthetic constructor <init>(Lh8/j0;Ll7/y;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/i0;->k:Lh8/j0;

    iput-object p2, p0, Lh8/i0;->l:Ll7/y;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lh8/i0;->k:Lh8/j0;

    iget-object v1, p0, Lh8/i0;->l:Ll7/y;

    invoke-static {v0, v1}, Lh8/j0;->w(Lh8/j0;Ll7/y;)V

    return-void
.end method
