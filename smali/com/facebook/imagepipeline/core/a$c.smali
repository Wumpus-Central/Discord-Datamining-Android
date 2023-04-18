.class public Lcom/facebook/imagepipeline/core/a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/imagepipeline/core/a$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/imagepipeline/core/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ly3/a;Ls5/c;Ls5/e;ZZZLq5/e;Ly3/h;Ly3/k;Lo5/s;Lo5/s;Lo5/e;Lo5/e;Lo5/f;Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;IIZILq5/a;ZI)Lq5/j;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ly3/a;",
            "Ls5/c;",
            "Ls5/e;",
            "ZZZ",
            "Lq5/e;",
            "Ly3/h;",
            "Ly3/k;",
            "Lo5/s<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Lu5/c;",
            ">;",
            "Lo5/s<",
            "Lcom/facebook/cache/common/CacheKey;",
            "Ly3/g;",
            ">;",
            "Lo5/e;",
            "Lo5/e;",
            "Lo5/f;",
            "Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;",
            "IIZI",
            "Lq5/a;",
            "ZI)",
            "Lq5/j;"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    move-object/from16 v14, p15

    move-object/from16 v15, p16

    move/from16 v16, p17

    move/from16 v17, p18

    move/from16 v18, p19

    move/from16 v19, p20

    move-object/from16 v20, p21

    move/from16 v21, p22

    move/from16 v22, p23

    new-instance v23, Lq5/j;

    move-object/from16 v0, v23

    invoke-direct/range {v0 .. v22}, Lq5/j;-><init>(Landroid/content/Context;Ly3/a;Ls5/c;Ls5/e;ZZZLq5/e;Ly3/h;Lo5/s;Lo5/s;Lo5/e;Lo5/e;Lo5/f;Lcom/facebook/imagepipeline/bitmaps/PlatformBitmapFactory;IIZILq5/a;ZI)V

    return-object v23
.end method
